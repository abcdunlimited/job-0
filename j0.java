//// This is your starter code.
//// Put your username here.

size( 640, 480 );
background( 50, 100, 200 );

// Body is a 30x50 rectangle, centered at (100,100).
fill(255,0,0);
rectMode(CENTER);
rect( 100,100, 30,50 );



//  Modify the above code as follows:
//    * change the color of the body.
//    * add a head 
fill(0,255,0);
ellipse( 100,70, 20,20 );

// eyes
fill(255);
ellipse( 90,60, 10,10 );
ellipse( 110,60, 10,10 );
fill(0,0,255);
ellipse( 90,60, 5,5 );
ellipse( 110,60, 5,5 );


//    * make it follow the mouse.

//  When you are done, commit your code and send me a "pull-request"
