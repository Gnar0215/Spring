#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

void main()
{
	int i;
	float f;
	double d;
	char ch;
	char s[10];

	printf("���� �Ѱ��� �Է��ϼ��� :\n");
	scanf(" %d", &i);

	printf("�Ǽ� �� �� �Է��ϼ��� : \n");
	scanf(" %f", &f);

	printf("Double�� �Ǽ� �� �� �Է��ϼ��� : \n");
	scanf(" %lf", &d);

	printf("���ĺ� �� ���ڸ� �Է��ϼ��� :\n");
	scanf(" %c", &ch);

	printf("���ĺ� ��ȩ ���ڸ� �Է��ϼ��� : \n");
	scanf("%s", &s);

	printf("�Է� ���� : %d\n", i);
	printf("�Է� �Ǽ� : %f\n", f);
	printf("�Է� ������ �Ǽ� : %lf\n", d);
	printf("�Է� ���� �� ���� : %ch\n", ch);
	printf("�Է� ���� ���� ����(���ڿ�) : %s\n", s);


}