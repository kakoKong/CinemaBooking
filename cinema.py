import csv

class User:
    def __init__(self, name, userid):
        self.name = name
        self.userid = userid
class Cinema:
    def __init__(self, name, capacity, cinemaid):
        self.name = name
        self.capacity = capacity
        self.userid = cinemaid
class Booking:
    def __init__(self, userid, cinemaid, startdate, enddate, bookingid):
        self.userid = userid
        self.cinemaid = cinemaid
        self.startdate = startdate
        self.enddate = enddate
        self.bookingid = bookingid

all_users = []
all_cinema = []
all_booking = []
userid=1
cinemaid=1
bookingid=1
command = input("What do you want to do: ")

if command == "CU":
    name = input("Input your name: ")
    user = User(name, userid)
    all_users.append(user)
    userid+1
elif command == "CC":
    name = input("Input Cinema Name: ")
    cap = input("Input Cinema Capacity: ")
    while int(cap)==ValueError:
        cap = input("Please input a number, input cinema capacity: ")
        if int(cap)!=ValueError:
            break
    cinema = Cinema(name,cap, cinemaid)
    all_cinema.append(cinema)
    cinemaid+1

with open("cinema.csv", "a", newline='') as csvfile:
    writer = csv.writer(csvfile)
    writer.writerow(all_users)
with open("cinema.csv", "a", newline='') as csvfile:
    writer = csv.writer(csvfile)
    writer.writerow(all_cinema)
