package examples.users;

import com.intuit.karate.junit5.Karate;
//cambios para ejecutar jenkins 
class UsersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return new Karate().feature("users").relativeTo(getClass());
    }    

}
