#include<sys/types.h>
#include<sys/ipc.h>
#include<sys/shm.h>
#include<stdio.h>
#include<stdlib.h>

#define MAXSIZE 27


int main(void) {
	int shmid;
	key_t key;
	char *shm, *s;

	key = 2211;
	fflush(stdin);
	shmid = shmget(key, MAXSIZE, IPC_CREAT | 0666);
	shm = shmat(shmid, NULL, 0);
	s=shm;
	*s='C';
	s[2]='T';
	printf("\n");
	while(1){
		sleep(0.5);
	}
	exit(0);
}

