package cats;

public class Animal implements Comparable<Animal>{
	
	
	
	String name;
	int legs;
	
	public Animal(String name,int legs){
		this.name=name;
		this.legs=legs;
	}
	
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Animal o) {
		if(this.legs==o.legs) {
			if(this.name.compareTo(o.name)==0) {
				return 0;
			}
			else if(this.name.compareTo(o.name)>0) {
				return 1;
			}
			else return -1;
		}
		else if(this.legs>o.legs) {
			return 1;
		}
		else return -1;
		
	}
	
	public int hashCode() {
        return name.hashCode();
    }
	
	public int compare(String name, int legs) {
		// TODO Auto-generated method stub
		if(this.name.compareTo(name)==0) {
			if(this.legs==legs) {
				return 0;
			}
			else if(this.legs>legs) {
				return 1;
			}
			else return -1;
		}
		else if(this.name.compareTo(name)>0) {
			return 1;
			/*
			if(this.legs==legs) {
				return 0;
			}
			else if(this.legs>legs) {
				return 1;
			}
			else return -1;
			*/
		}
		else {//if(this.name.compareTo(name)<0) {
			return -1;
			/*
			if(this.legs==legs) {
				return 0;
			}
			else if(this.legs>legs) {
				return 1;
			}
			else return -1;
			*/
		}
		//return 0;
	}

	public int getLegs() {
		// TODO Auto-generated method stub
		return legs;
	}

}
