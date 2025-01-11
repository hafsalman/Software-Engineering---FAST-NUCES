#include<stdio.h>
#include<pthread.h>
#include<stdlib.h>
#include<unistd.h>

int counter =0;
int arr1=1;
pthread_mutex_t mutex;

void *printp1(void *parm){
		int i;
		while(*(int*)parm!=arr1){
			sleep(0.1);
		}
		pthread_mutex_lock(&mutex);
		for(i=0;i<5;i++){
			counter++;
			printf("thread %d counter %d\n",*(int*)parm,counter);	
		}
		pthread_mutex_unlock(&mutex);
		
		arr1++;
		//printf("%d =array",arr1);
}

int main(){
	int a=1,b=2,c=3;
	pthread_t t1,t2,t3;
	pthread_create(&t1,0,printp1,(void*)&a);
	pthread_create(&t2,0,printp1,(void*)&b);
	pthread_create(&t3,0,printp1,(void*)&c);
	pthread_join(t1,0);
	pthread_join(t2,0);
	pthread_join(t3,0);
	pthread_mutex_destroy(&mutex);
	return 0;
}
