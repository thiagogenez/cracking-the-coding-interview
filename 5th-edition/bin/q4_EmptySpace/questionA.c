#include <stdio.h>
#include <string.h>

/**
 * Write a method to replace all spaces in a string with'%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform this
 * operation in place.)
 * EXAMPLE
 * Input:  "Mr John Smith     "
 * Output: "Mr%20Dohn%20Smith"
 */

void fullfill(char *str, int i){
	str[i - 0] = '0';
	str[i - 1] = '2';
	str[i - 2] = '%';
}


 void replace(char *str){
 	int i = strlen(str);
 	i--;

 	int j = i;

 	while(str[i] == ' '){
 		i--;
 	}


 	while(i >=  0){

 		while(str[i] != ' ' && i >= 0){
 			str[j] = str[i];
 			j--; i--;
 		}

 		

 		fullfill(str, j);
 		j -= 3;
 		i--;

 	}
 }

int main(){

	char input[22];

    fgets(input, 22, stdin);
    input[strcspn(input, "\n")] = 0;

    printf("antes: %s\n", input);
    replace(input);
    printf("depois: %s\n", input);

}