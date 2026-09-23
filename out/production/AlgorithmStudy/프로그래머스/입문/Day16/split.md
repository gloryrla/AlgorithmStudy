# 문자열 자르기

## 문제 설명
문자열 `my_str`과 `n`이 매개변수로 주어질 때, `my_str`을 길이 `n`씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

## 제한사항
- 1 ≤ `my_str`의 길이 ≤ 100
- 1 ≤ `n` ≤ `my_str`의 길이
- `my_str`은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.

## 입출력 예
| my_str | n | result |
|---|---|---|
| "abc1Addfggg4556b" | 6 | ["abc1Ad", "dfggg4", "556b"] |
| "abcdef123" | 3 | ["abc", "def", "123"] |