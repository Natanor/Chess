
public class MouseStuff {
	StartDisplay a ;
	int SelectedTile = -1;
	boolean MouseWasPressed = false;
	boolean Double = false;
	
	MouseStuff(StartDisplay sd){
		a= sd;
	}
	void setSelectedTile(){
	  if(a.lMouse){
		  MouseWasPressed =true;
	  }
	  if(!a.lMouse && MouseWasPressed){
		  if( SelectedTile == (int)(a.mx/(a.width/8))*10 + (int)(a.my/(a.hight/8))){
			  SelectedTile = -1;
			  System.out.println("Double");
			  
		  }else{ SelectedTile = (int)(a.mx/(a.width/8))*10 + (int)(a.my/(a.hight/8));
		  	System.out.println(""  +a.mx+" " +a.my+ " " + SelectedTile);
		  	System.out.println("Selcted Tile is: "+ SelectedTile/10 + " " + (SelectedTile-(SelectedTile/10)*10));
		  }
		  MouseWasPressed = false;
	  }
	 // System.out.println("Selcted Tile is: "+ SelectedTile/10 + " " + (SelectedTile-(SelectedTile/10)*10));
	}
}
