def divisible_3(num):
    if num % 3 == 0:
        return True

def divisible_5(num):
    if num % 5 == 0:
        return True

def run():
    for i in range(1,101):
        if divisible_3(i) and divisible_5(i):
            print("Fizz buzz")
        elif divisible_3(i):
            print("Fizz")
        elif divisible_5(i):
            print("Buzz")
        else:
            print(i)
        

if __name__=='__main__':
    run()