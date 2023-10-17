package classes;

public abstract class Housing {
    public abstract int getCapacity();

public abstract String getPrintable();
public int id;
public Housing(int id){
    this.id = id;
}
public boolean isSuitableForPeople(){
    return true;
}
}

