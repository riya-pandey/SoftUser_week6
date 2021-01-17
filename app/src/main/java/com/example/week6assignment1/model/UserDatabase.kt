package com.example.week6assignment1.model

var students = mutableListOf<User>(User("https://scontent.fktm7-1.fna.fbcdn.net/v/t1.0-9/133933032_432943881072022_4998123862273128077_n.jpg?_nc_cat=111&ccb=2&_nc_sid=09cbfe&_nc_ohc=yZwYgXEv8AMAX9D8J5R&_nc_ht=scontent.fktm7-1.fna&oh=c5dcb8e6c22b01f3246ac463c4667cc2&oe=6029A065","Riya Pandey" ,"21","Female","Lazimpat"))

class UserDatabase() {
   private val user1 = User("https://scontent.fktm7-1.fna.fbcdn.net/v/t1.0-9/133933032_432943881072022_4998123862273128077_n.jpg?_nc_cat=111&ccb=2&_nc_sid=09cbfe&_nc_ohc=yZwYgXEv8AMAX9D8J5R&_nc_ht=scontent.fktm7-1.fna&oh=c5dcb8e6c22b01f3246ac463c4667cc2&oe=6029A065","Riya Pandey" ,"21","Female","Lazimpat")


    fun getStudent():MutableList<User>
    {
        return students
    }
}

