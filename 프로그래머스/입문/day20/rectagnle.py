def solution(polynomial):
    answer = ''
    result = polynomial.split("+")
    count = 0
    for i in "x":
        print(i)
        count += int (i)
        # if (i == "x"):
        #     count += 1

    print(count)

    return answer

solution("3x+3+x")

