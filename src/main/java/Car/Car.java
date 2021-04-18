package Car;
class Car{
	String Color ; 
	String Model ;
	double currentSpeed;
	double MaximumSpeed;
	Motor motor;
        
	//liga o carro
	void toConnect() {
		System.out.println("O carro esta ligado");
                
               
	}

	//acelera uma certa quantidade
	void speedsUp(double theAmount) {
		double newSpeed = this.currentSpeed + theAmount;
		this.currentSpeed = newSpeed;
                
	}

	//devolve a marcha do carro
	int catchMarch() {
		if (this.currentSpeed < 0) {
			return -1;
		}
		if (this.currentSpeed >= 0 && this.currentSpeed < 40) {
			return 1;
		}
		if (this.currentSpeed >= 40 && this.currentSpeed < 80) {
			return 2;
		}
		return 3;
	}

    private void ReadLn(Integer March) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void March() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}