#include<stdio.h>
#include<pthread.h>
#include<stdlib.h>
#include<unistd.h>


void *printp1(){
	while(1){
		printf("T1 = HELLO\n");
		sleep(1);
	}
}
void *printp2(){
	while(1){
		sleep(1);
		printf("T2 = WORLD\n");
	}
}
int main(){
	pthread_t t1,t2;
	pthread_create(&t1,NULL,printp1,NULL);
	pthread_create(&t2,NULL,printp2,NULL);
	pthread_join(t1,NULL);
	pthread_join(t2,NULL);
	return 0;
}
