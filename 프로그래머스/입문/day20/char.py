def solution(keyinput, board):
    answer = [0, 0]
    max_x = board // 2
    max_y = board // 2
    for i in keyinput:
        if (i == "left"):
            if (answer[0] <= -max_x):
                continue
            answer[0] -= 1
        elif (i == "right"):
            if (answer[0] >= max_x):
                continue
            answer[0] += 1
        elif (i == "up"):
            if (answer[1] >= max_y):
                continue
            answer[1] += 1
        elif (i == "down"):
            if (answer[1] <= -max_y):
                continue
            answer[1] -= 1

    return answer

solution()