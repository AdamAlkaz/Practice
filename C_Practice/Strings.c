#include <stdio.h>
#include <string.h>


void sortWords (char wordListCopy[101][21], int wordcount){
	char temp;
	int len;
	for (int i = 0; i < wordcount; i++){
		len = strlen(wordListCopy[i]);
		for (int j = 0 ; j < len; j++){
			for (int k = j ; k < len; k++){
				if((int)wordListCopy[i][j] < (int)wordListCopy[i][k]){
					temp = wordListCopy[i][j];
					wordListCopy[i][j] = wordListCopy[i][k];
					wordListCopy[i][k] = temp;
				}
			}
		}
	}
}

void groupWords (char wordList[101][21], char wordListCopy[101][21], int numOfWordsInGroup[6], int wordcount, int startIndex[6]){
	char tempWord[21];
	for (int i = 0; i < wordcount; i++){
		for (int j = i + 1 ; j < wordcount; j++){
			if (strcmp (wordListCopy[i],wordListCopy[j]) == 0){
				strcpy(tempWord,wordListCopy[i+1]);
				strcpy(wordListCopy[i+1], wordListCopy[j]);
				strcpy(wordListCopy[j], tempWord);
				strcpy(tempWord, wordList[i+1]);
				strcpy(wordList[i+1], wordList[j]);
				strcpy(wordList[j],tempWord);
			}
		}
	}
	int count = 0, inserted = 0, tempIndex = 0;
	strcpy(tempWord, wordListCopy[0]);
	for (int i = 1; i < wordcount; i++){
		if (strcmp(wordListCopy[i],tempWord) == 0){
			count++;
		}
		else{
			for (int j = 0; j < 6; j++){
				if (count > numOfWordsInGroup[j] && !inserted){
					for (int k = 6; k > j; k--){
						numOfWordsInGroup[k] = numOfWordsInGroup [k-1];
						startIndex[k] = startIndex[k-1];
					}
					numOfWordsInGroup[j] = count;
					inserted = 1;
					startIndex[j] = tempIndex;
				}
			}
			count = 0;
			strcpy(tempWord,wordListCopy[i]);
			inserted = 0;
			tempIndex = i;
		}
	}
}

void printInfo (char wordList[101][21], int numOfWordsInGroup [6], int wordcount, int startIndex[6]){
	for (int i = 0; i < 6; i++){
		printf ("%d words in group %d: ", numOfWordsInGroup[i], i);

		for (int j = startIndex[i]; j < (startIndex[i] + numOfWordsInGroup[i]); j++){
			printf ("%s ", wordList[j]);
		}
		printf("\n");
	}
}

void processStrings (char wordList[101][21], int numOfWordsInGroup [6], int wordcount, int startIndex[6]){
	char wordListCopy[101][21];
	for (int i = 0; i < wordcount; i++){
		strcpy(wordListCopy[i], wordList[i]);
	}
	sortWords (wordListCopy, wordcount);
	groupWords (wordList, wordListCopy, numOfWordsInGroup, wordcount, startIndex);
	printInfo (wordList, numOfWordsInGroup, wordcount, startIndex);
}

int main (void){
	char WordList[101][21];
	int numOfWordsInGroup[6] = {0}, startIndex[6], wordcount = 0;
	char word[21];
	int done = 0, count = 0;
	char ch = getchar();
	do
	{
		while (ch != '\n'){
			word[count++] = ch;
			ch = getchar();
		}
		count = 0;
		if (strcmp(word, "STOP")==0 || wordcount > 99)
		break;
		ch = getchar();
		strcpy(WordList[wordcount++], word);
		strcpy(word,"");
	}while(!done);
	processStrings (WordList, numOfWordsInGroup, wordcount, startIndex);
}
