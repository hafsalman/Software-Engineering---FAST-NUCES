#include<sys/types.h>
#include<sys/ipc.h>
#include<sys/shm.h>
#include<stdio.h>
#include<stdlib.h>

#define MAXSIZE 27



int main(void) {
	char c;
	int shmid;
	key_t key;
	char *shm, *s;

	key = 2211;
	
	shmid = shmget(key, MAXSIZE, IPC_CREAT | 0666);
		
	shm = shmat(shmid, NULL, 0);
	s = shm;
	s[1]='A';
	putchar(s[1]);
	printf("Closing with *");
	putchar(s[0]);
	putchar(s[1]);
	putchar(s[2]);
}

