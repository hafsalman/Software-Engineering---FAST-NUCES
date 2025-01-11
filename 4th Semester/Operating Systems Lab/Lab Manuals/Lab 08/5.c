#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

// Define a struct to hold the arguments
typedef struct {
    int int_arg;
    float float_arg;
    char str_arg[100];
} ThreadArgs;

// Thread function
void* loop(void* arg) {
    // Cast the argument to ThreadArgs pointer
    ThreadArgs* args = (ThreadArgs*)arg;

    // Access the arguments
    printf("Thread: int_arg = %d, float_arg = %.2f, str_arg = %s\n",
           args->int_arg, args->float_arg, args->str_arg);

    return NULL;
}

int main() {
    pthread_t t1;

    // Initialize arguments
    ThreadArgs args;
    args.int_arg = 42;
    args.float_arg = 3.14;
    strcpy(args.str_arg, "Hello, world!");

    // Create the thread, passing &args as the argument
    pthread_create(&t1, NULL, loop, &args);

    // Wait for the thread to finish
    pthread_join(t1, NULL);

    return 0;
}

