import re
from PyCalc import calc_operations as co


def calculator(expression):
    global res
    numbers = re.split(r"[+|\-|*|/]", expression)
    oper = [i for i in re.split(r"\d+", expression) if i != '.' and i != '' and i != ' ']
    x = float(numbers[0])
    y = float(numbers[1])
    if oper[0] == '+':
        res = co.summa(x, y)
    elif oper[0] == '-':
        res = co.sub(x, y)
    elif oper[0] == '*':
        res = co.mul(x, y)
    elif oper[0] == '/':
        res = co.div(x, y)
    return res
