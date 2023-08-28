public class Car extends  Nice_Car implements Engine,Media {

   Engine engine;
  Engine spare_engine;
 Media media = new Music();

 void start_music(){
   media.start();
 }
  void stop_music(){
   media.stop();
  }
  Car(){
      this.engine = new Normal_Engine();
      spare_engine=this.engine;
  }
  void upgrade( ){
    this.engine = new Upgraded();
  }

  void downgrade(){
    this.engine = spare_engine;
  }

    public static void main(String[] args) {
      Car car = new Car();
      Nice_Car.i=0;

     System.out.println(Car.i+" "+ car.j);

      car.start();
      car.start_music();
      car.stop_music();
      car.stop();
      car.upgrade();
      car.start();
      car.start_music();
      car.stop_music();
      car.stop();
      car.downgrade();
      car.start();
      car.stop();
       
    }

    @Override
    public void start() {
      engine.start();
    }

    @Override
    public void stop() {

        engine.stop();
    }

    @Override
    public void brake() {
      engine.brake();
    }

    @Override
    public void acc() {

    engine.acc();
    }


}
