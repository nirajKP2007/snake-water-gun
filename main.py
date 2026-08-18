'''
1 for snake
-1 for water
0 for gun'''
import random
computer = random.randint(-1,1)

yourchoice = input("Enter s for snake , w for water and g for gun: ")

yourDict = {"s":1,"w":-1,"g":0}

reverseDict = {1:"Snake",0:"Gun",-1:"water"}

you = yourDict[yourchoice]
print (f"Computer chose {reverseDict[computer]}")
print (f"You chose {reverseDict[yourDict[yourchoice]]}")

if you == computer:
    print("Its a draw!!")

else:
    if (you == -1 and computer == 0):
        print("You Win!!!")
    elif (you == -1 and computer == 1):
        print("You Loose!!!")
    elif (you == 1 and computer == 0):
        print("You Loose!!!")
    elif (you == 1 and computer == -1):
        print("You Win!!!")
    elif (you == 0 and computer == -1):
        print("You Loose!!!")
    elif (you == 0 and computer == 1):
        print("You Win!!!")
    else:
        print("Something went Wrong !!!!!")