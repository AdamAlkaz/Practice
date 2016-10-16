#include <stdio.h>

int main (void)
{
	long int curr = 1, prev = 0;
	long int fibnum[40];
	fibnum [0]=0;
	printf ("%ld ",fibnum[0]);
	fibnum[1]=1;
	printf ("%ld ",fibnum[1]);
	for (int i = 2; i < 40 ; i++)
	{
		fibnum[i] = prev+ curr;
		prev = curr;
		curr = fibnum[i];
		printf ("%ld ",fibnum[i]);

	}
}
