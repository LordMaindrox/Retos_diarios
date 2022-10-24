def fibonacci(n):
    num1 = 0
    num2 = 1
    result = [0, 1, ]
    
    for i in range(n):
        result.append(num1+num2)
        aux = num1 + num2
        num1 = num2
        num2 = aux
    return print(result)

def run():
    limit = int(input("How many digit do you want?: "))
    fibonacci(limit)

if __name__=='__main__':
    run()