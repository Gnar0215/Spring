#include <stdio.h>
#include <time.h>

int main(void)
{
	time_t start, end;
	start = time(NULL);
	printf("10�ʰ� �Ǹ� �ƹ� Ű�� ��������\n");
	while (1) {
		if (getchar())
			break;
	}
	printf("����Ǿ����ϴ�\n");
	end = time(NULL);
	printf("����� �ð��� %ld�� �Դϴ�.\n", end - start);
	return 0;
}