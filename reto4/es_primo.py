def is_valid_number(number):
    if number > 0:
        return True
    else:
        print("Solo acepta números mayores a cero")
        return False

def is_prime(number):
    prime = True
    if number == 1:
        return False
    elif number == 2:
        return True
    else:
        for i in range (2, number):
            if number % i == 0:
                prime = False
            else:
                pass
        if prime == True:
            return print("The number is prime")
        else:
            return print("The number is not prime")

def run():
    valor = int(input("Write one number. Is this a prime number?: "))
    if is_valid_number(valor)==True:
        is_prime(valor)


if __name__=='__main__':
    run()
    
    
    