


interface Compare{
    public boolean isGreater(Object o1, Object o2) ;
}

/*for id*/
 class InterfaceImplementation implements Compare {
    public boolean isGreater(Object o1, Object o2){
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
     if(e1.getEmployeeId() > e2.getEmployeeId()){
              return  true;
            } else
        return false;
            }}

 class InterfaceImplementation2 implements Compare {
    public boolean isGreater(Object o1, Object o2){
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
    if(e1.getEmployeeName().compareTo(e2.getEmployeeName()) == 1){
      return  true;
    } else
            return false;
}
}




