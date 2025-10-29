#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int get_integer()
{
	int value;

	printf("정수를 입력하시오: ");
	scanf("%d", &value);
	return value;
}
