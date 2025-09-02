package Codes;

class Room1 {
    private int roomNo;
    private int capacity;
    private static int roomCounter;

    static {
        roomCounter = 500; 
    }

    public Room1() {
        this.roomNo = roomCounter++;
        this.capacity = 4; 
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getRoomCounter() {
        return roomCounter;
    }

    public static void setRoomCounter(int roomCounter) {
        Room1.roomCounter = roomCounter;  // ✅ FIXED (changed Room → Room1)
    }

    public String toString() {
        return "Room\nroomNo: " + this.roomNo + "\ncapacity: " + this.capacity;
    }
}


class Member1 {
    private int memberId;
    private String name;
    private Room1 room;

    public Member1(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room1 getRoom() {
        return room;
    }

    public void setRoom(Room1 room) {
        this.room = room;
    }

    public String toString() {
        return "Member\nmemberId: " + this.memberId + "\nname: " + this.name;
    }
}


class Admin1 {
    public void assignRoom(Room1[] rooms, Member1 member) {
        for (Room1 room : rooms) {
            if (room.getCapacity() > 0) {
                member.setRoom(room);
                room.setCapacity(room.getCapacity() - 1);
                return;
            }
        }
        member.setRoom(null);
    }
}


public class AggAss3 {
    public static void main(String args[]) {
        Room1 room1 = new Room1();
        Room1 room2 = new Room1();
        Room1 room3 = new Room1();
        Room1 room4 = new Room1();
        Room1 room5 = new Room1();

        Room1[] totalRooms = { room1, room2, room3, room4, room5 };

        Admin1 admin = new Admin1();

        Member1 member1 = new Member1(101, "Serena");
        Member1 member2 = new Member1(102, "Martha");
        Member1 member3 = new Member1(103, "Nia");
        Member1 member4 = new Member1(104, "Maria");
        Member1 member5 = new Member1(105, "Eva");

        Member1[] members = { member1, member2, member3, member4, member5 };

        for (Member1 member : members) {
            admin.assignRoom(totalRooms, member);
            if (member.getRoom() != null) {
                System.out.println("Hi " + member.getName() + "! Your room number is " + member.getRoom().getRoomNo());
            } else {
                System.out.println("Hi " + member.getName() + "! No room available");
            }
        }
    }
}
