#include<stdio.h>
#include<pthread.h>
#include<stdlib.h>
#include<unistd.h>


void *printp1(void *parm){
		printf("HELLO = %d\n",(int)parm);
		return (void*)2;
}

void *printp2(void* parm){
	printf("Some Value =%d\n",*(int*)parm);
	return (void*)13;
}

int main(){
	pthread_t t1,t2;
	int val1=1,val2=2;
	pthread_create(&t1,0,printp1,(void*)1);
	pthread_create(&t2,0,printp2,(void*)&val2);
	void *rc,*get;
	pthread_join(t1,&rc);
	pthread_join(t2,&get);
	printf("%d\n",(int)rc);
	printf("%d\n",(int)get);
	return 0;
}
