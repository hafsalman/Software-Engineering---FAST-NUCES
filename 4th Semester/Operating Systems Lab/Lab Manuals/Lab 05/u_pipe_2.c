#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include <sys/wait.h>

int main(void) {
	int pipefd[2];
	int pid;
	char buffer[15];
	pipe(pipefd);
	pid = fork();

	if(pid > 0) {
		printf("unamed_pipe [INFO] Parent Process\n");
		write(pipefd[1],"Hello Child",12);
		close(pipefd[1]);
	}
	else if(pid == 0) {
		sleep(5);
		printf("unamed_pipe [INFO] Child Process\n");
		read(pipefd[0], buffer, sizeof(buffer));
		close(pipefd[0]);
		write(1,buffer, sizeof(buffer));
		printf("\n");	
		write(pipefd[1],"Hello Parent",13);
		close(pipefd[1]);
	}
	else {
		printf("unamed_pipe [ERROR] Error in creating child process\n");	
	}
	if(pid > 0){ wait(NULL);}
	read(pipefd[0],buffer,sizeof(buffer));
	close(pipefd[0]);
	printf("Response from child =%s",buffer);
	
	return 0;
}
