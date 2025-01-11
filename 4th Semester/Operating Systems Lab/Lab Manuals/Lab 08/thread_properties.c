#include <pthread.h>
#include <stdio.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<stdlib.h>
#include<unistd.h>
void* myThreadFunc(void* arg) {
	for(int i=0;i<5;i++){
	printf("TH=%d\n",(int)arg);
	sleep(0.1);
	}
}

void* th2(void* arg){
	printf("%d\n",(int)arg);
}


int main() {
    pthread_t thread,thread2;
    pthread_attr_t attr;
    pthread_attr_init(&attr);

    // Set detached state attribute
    pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_JOINABLE);

    // Set stack size to 2 MB
    pthread_attr_setstacksize(&attr, 2 * 1024 * 1024);

    pthread_attr_setschedpolicy(&attr, SCHED_FIFO);

    // Create the thread with the specified attributes
    pthread_create(&thread, &attr, myThreadFunc, (void*)1);
    pthread_create(&thread2,&attr,th2,(void*)2);
    // Clean up
    pthread_attr_destroy(&attr);
    pthread_join(thread, NULL);
    pthread_join(thread2,NULL);  // Only needed if thread is joinable

    return 0;
}
