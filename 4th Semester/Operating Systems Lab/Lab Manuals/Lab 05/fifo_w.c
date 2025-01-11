#include<stdio.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<fcntl.h>
#include<unistd.h>

int main(void) {
	int fd, retval;
	char buffer[] = "this is the operating system last lab before mid... mid paper will be on Saturday 30th October,2021";
	char buffer1[512]={};
	fflush(stdin);
	retval = mkfifo("/tmp/myfifo",0666);
	fd = open("/tmp/myfifo",O_WRONLY);
	write(fd,buffer,sizeof(buffer));
	close(fd);
	printf("Information Sent");
	fd = open("/tmp/myfifo",O_RDONLY);
	retval = read(fd, buffer1, sizeof(buffer1));
	fflush(stdin);
	//write(1, buffer, sizeof(buffer));
	puts(buffer1);
	printf("\n");	
	close(fd);
	return 0;
}
