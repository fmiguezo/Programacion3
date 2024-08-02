// User ahora sólo se ocupa de crear el usuario. En lugar de depender de encrypter, ahora le pasamos
// por parámetro la BD que va a utilizar para guardar el usuario en caso de que no exista.
// La clase sólo se ocupa de crear usuarios.

public class User {
    private String userName,
    private String password;
    private BD bd;

    User(bd BD){
        this.bd = bd;
    }

    public Boolean createUser(String user, String pass){
        if(!this.bd.existUser(user)){
        this.bd.saveUser(user, pass);
        }
    else {
            throw new Exception("Usuario ya existe");
        }
    }
}


// La lógica de validación debe ir a una clase dedicada para realizar esa función únicamente.
// Además, el encriptador, que ahora es una interfaz, se pasa por parámetro en el constructor,
// que junto con un setter, permite modificar el encriptador utilizado en tiempo de ejecución.

public class Validator {
    private Encrypter encrypter;
    private BD bd;

    Validator(encrypter Encrypter, BD bd){
        this.encrypter = encrypter;
        this.bd = bd;
    }

    public Boolean validateLogin(String userName, String pass){
        try{
            User user = this.bd.getUser(userName);
            String hashedPass = this.encrypter.hashPassword(pass);
            return user.hashedPassword == hashedPass;
        }
        catch (Exception e) {
        
        }
    }

    public void setEncrypter(encrypter Encrypter){
        this.encrypter = encrypter;
    }

    public void setBD(bd BD){
        this.bd = bd;
    }
}


// Encrypter debería ser una interfaz, y cada uno de los encriptadores específicos una clase concreta.
// De este modo, las clases que quieran utilizar la encriptación pueden utilizar composición con una interfaz
// en lugar de estar acompladas a una clase concreta. => ésto dar mayor flexibilidad e incluso permitiría
// implementar un patrón de diseño como strategy para trabajar con las estrategias de encriptación.

public interface Encrypter(){
    public String hashPassword(String pass) {};

}

public class Md5Encrypter implements Encrypter {
    public String hashPassword(String pass) {
        // lógica de encriptación de Md5
        return encryptedPass;  
    }
}

public class SHA256Encrypter implements Encrypter {
    public String hashPassword(String pass) {
        // lógica de encriptación de SHA256
        return encryptedPass;  
    }
}

// La lógica de buscar usuarios en una BD debería estar en una clase específica para ello, para mantener
// SRP. No queda clase para que utiliza la DB el encriptador, pero dependiendo para que la use
// podríamos plantear agregación para poder trabajar con BD.

public class BD() {
    public Boolean existUser(String user) {
    // busca el usuario en una BD. Devuelve true si lo encuentra.
    }

    public Boolean getUser(String user) {
    // busca el usuario en una BD. Devuelve el usuario si lo encuentra.
    // Arroja UserNotFoundException en caso de que no exista
    }
}





// public class User {
//     private String userName,
//     private String password;
//     private Encrypter encrypter;

//     User(){
//         this.encrypter = new Encrypter();
//     }

//     public Boolean createUser(String user, String pass){
//         if(!this.encrypter.existUser(user)){
//         this.encrypter.saveUser(user, pass);
//         }
//     else {
//             throw new Exception(“Usuario ya existe”);
//         }
//     }

//     public Boolean loginUser(String userName, String pass){
//         try{
//             User user = this.encrypter.getUser(userName);
//             String hashedPass = this.encrypter.hashPassword(pass, ‘MD5’);
//             return user.hashedPassword == hashedPass;
//         }
//         catch (Exception e) {
        
//         }
//     }
// }



// public class Encrypter {

//     private MD5Encrypter encrypter;

//     Encrypter(){
//         encrypter = new Md5Encrypter();
//     }

//     public Boolean existUser(String user) {
//     // busca el usuario en una BD. Devuelve true si lo encuentra.
//     }

//     public Boolean getUser(String user) {
//     // busca el usuario en una BD. Devuelve el usuario si lo encuentra.
//     // Arroja UserNotFoundException en caso de que no exista
//     }

//     public String hashPassword(String pass, String alg) {
//         if(alg == ‘MD5’) {
//             Md5Encrypter e = new Md5Encrypter();
//             return e.encrypt(pass);
//         }
//         if(alg == ‘SHA256’){
//             SHA256Encrypter e = new SHA256Encrypter();
//             return e.encrypt(pass);
//         }
//     }
// }