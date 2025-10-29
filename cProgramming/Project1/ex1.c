#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

void main()
{
	int i;
	float f;
	double d;
	char ch;
	char s[10];

	printf("정수 한개를 입력하세요 :\n");
	scanf(" %d", &i);

	printf("실수 한 개 입력하세요 : \n");
	scanf(" %f", &f);

	printf("Double형 실수 한 개 입력하세요 : \n");
	scanf(" %lf", &d);

	printf("알파벳 한 글자를 입력하세요 :\n");
	scanf(" %c", &ch);

	printf("알파벳 아홉 글자를 입력하세요 : \n");
	scanf("%s", &s);

	printf("입력 정수 : %d\n", i);
	printf("입력 실수 : %f\n", f);
	printf("입력 더블형 실수 : %lf\n", d);
	printf("입력 문자 한 글자 : %ch\n", ch);
	printf("입력 문자 여러 글자(문자열) : %s\n", s);


}