def evaluate_word(a,b):
    a = a.replace(" ","").lower()
    b = b.replace(" ","").lower()
    if a == b or a == "" or b == "" or len(a) != len(b):
        return False
    else:
        if sorted(a) == sorted(b):
            return print("Is Anagram")
        else:
            return print("Is not Anagram")

def run():
    string_1 = input("Introduce a first word: ")
    string_2 = input("Introduce a second word: ")
    evaluate_word(string_1, string_2)
        
if __name__=='__main__':
    run()