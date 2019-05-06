import java.awt.*;


public class Bat {

    private Rectangle region;
    private int size;
    private Color color;
    private Point center;

    Bat(Point center) {
        this.center = center;
        size = 50;
        region = new Rectangle(center.x-size/2,center.y-size/2, size*2, size);
        color = color.BLUE;
    }

    protected void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(region.x,region.y, region.width,region.height);
    }

    protected Rectangle getRegion() {
        return region;
    }

    protected void hitBy(MovingDot d) {
        if ((d.top() > top()) && (d.bottom() < bottom())) {
            d.reflectX(); }
        else { if ((d.left() > left()) && (d.right() < right())) { d.reflectY(); }
        else{ d.reflectX();d.reflectY(); } } }

    public int top(){ return region.y; }
    public int bottom(){ return region.y+region.height; }
    public int left(){ return region.x; }
    public int right(){ return region.x +region.width; }

    protected void setCenterX(int change) {
        center.x = center.x + change;
        region.x = center.x-size/2;
    }
    protected void setCenterY(int change){

        center.y = center.y + change;
        region.y = center.y -size/2;}


}
