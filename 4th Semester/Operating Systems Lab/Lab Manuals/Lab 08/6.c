#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>


void * array(void* arg){
	int* arr=(int *)arg;
	for(int i=0;i<5;i++){
		printf("%d ",*arr);
		arr++;
	}
}	

int main(){
	int arr2[5]={1,2,3,4,5};
	pthread_t t1;
	pthread_create(&t1,NULL,array,(void*)arr2);
	pthread_join(t1,NULL);
	return 0;
}
