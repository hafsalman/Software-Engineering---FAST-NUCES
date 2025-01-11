#include<stdio.h>
#include<pthread.h>
#include<stdlib.h>
#include<unistd.h>


void *printp(){
	//printf("Process id=%d, parent process =%d thread id =%ld\n",getpid(),getppid(),pthread_self());
	printf("printp\n");
}

void* print1(){
	printf("print1");
}

int main(){
	pthread_t t1,t2;
	//pthread_attr_t attr;
	//pthread_attr_init(&attr);
	//pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_JOINABLE);
	//pthread_attr_setschedpolicy(&attr, SCHED_FIFO);
	//printp();
	pthread_create(&t1,NULL,printp,NULL);
	pthread_create(&t2,NULL,print1,NULL);
	//pthread_attr_destroy(&attr);
	//pthread_join(t1,NULL);
	//pthread_join(t2,NULL);
	return 0;
}
