package com.sarsdev.figura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout capa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dibujo dibujo = new Dibujo(this);

        capa = findViewById(R.id.capa);
        capa.addView(dibujo);

    }

    public class Dibujo extends View {

        public Dibujo (Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {

            // Rectangulo
            Paint paint1 = new Paint();
            canvas.drawRGB(255, 255, 255);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();

            paint1.setARGB(255, 255, 0, 255);
            canvas.drawRect(200, 10, ancho-750, 150, paint1);

            //Triangulo
            Path path = new Path();
            Paint paint2 = new Paint();
            paint2.setColor(Color.parseColor("#20A573"));

            Point a = new Point(200, 450);
            Point b = new Point(350, 200);
            Point c = new Point(500, 450);

            path.lineTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(a.x, a.y);

            canvas.drawPath(path, paint2);

            //Rombo
            Path path1 = new Path();
            Paint paint3 = new Paint();
            paint3.setColor(Color.parseColor("#276CB9"));

            path1.lineTo(600, 450);
            path1.lineTo(750, 200);
            path1.lineTo(900, 450);
            path1.lineTo(750, 700);
            path1.lineTo(600, 450);

            canvas.drawPath(path1, paint3);

            //Trapecio
            Path path2 = new Path();
            Paint paint4 = new Paint();
            paint4.setColor(Color.parseColor("#A06186"));

            path2.lineTo(1000, 200);
            path2.lineTo(1150, 200);
            path2.lineTo(1300, 450);
            path2.lineTo(1150, 450);
            path2.lineTo(1000, 450);
            path2.lineTo(1000, 200);

            canvas.drawPath(path2, paint4);

        }

    }

}