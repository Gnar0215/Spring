#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#define SIZE 10

int main(void)
{

	char ans1;
	int ans2, ans3 , i, reserved=0;
	int seats[SIZE] = { 0 };
	while (1)
	{
		int empty = 0;

		for (i = 0; i < SIZE; i++) {
			if (seats[i] == 0)
				empty++;
		}
		if (empty < 2) {
			printf("\n남은 좌석이 2개 미만입니다.\n");
			break;
		}

		printf("좌석을 예약하시겠습니까?(y또는n)");
		scanf(" %c", &ans1);

		if (ans1 == 'n')
			break;

		printf("-------------------\n");
		printf(" 1 2 3 4 5 6 7 8 9 10\n");
		printf("-------------------\n");

		for (i = 0; i < SIZE; i++)
			printf(" %d", seats[i]);
		printf("\n");

		printf("몇 번째 좌석을 예약하시겠습니까");
		scanf("%d %d", &ans2, &ans3);

		if (seats[ans2 - 1] == 0 && seats[ans3 - 1] == 0) {
			seats[ans2 - 1] = 1;
			seats[ans3 - 1] = 1;
			reserved += 2;
			printf("좌석 %d, %d가 예약되었습니다!\n", ans2, ans3);
		}
		else {
			printf("이미 예약된 좌석이 포함되어 있습니다.\n");
		}
	}
	return 0;
}