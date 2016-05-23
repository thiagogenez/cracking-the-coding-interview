#include <stdio.h>
#include <string.h>

void swap(char *a, char *b){
    char tmp = *a;
    (*a) = (*b);
    (*b) = tmp;
}

void reverse(char *str){
    if(str == NULL){
        return;
    }

    char *end = str;
    char *begin = str;

    while((*end) != '\0'){
        end++;
    }
    end--;

    while(begin < end){

        swap(begin, end);
        begin++;
        end--;
    }

}

int main(void){
    char array[100];
    fgets(array, 100, stdin);
    array[strcspn(array, "\n")] = 0;

    printf("reverse(%s) = ", array);
    reverse(array);

    printf("%s\n", array);
}
