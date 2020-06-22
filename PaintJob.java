public class PaintJob {
    public static  int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int buckets = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return  -1;

        } else {
            double area = Math.ceil((width * height) * (1 / areaPerBucket));
            buckets = (int) (area - extraBuckets);

        }

        return buckets;

    }
    public  static  int getBucketCount(double width, double height, double areaPerBucket ){
        int bucket = 0;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return  -1;
        }else {
           double  a = Math.ceil((width*height)*(1/areaPerBucket));
             bucket =  (int) a;

        }
        return bucket;


    }
    public static  int getBucketCount(double area, double areaPerBucket){
        int bucketss = 0;
        if(area <= 0 || areaPerBucket <= 0){

            return  -1;
        }
        else {
            double are = Math.ceil(area/areaPerBucket);
            bucketss = (int) are;


        }

        return bucketss;


    }

    public static void main(String[] args) {
       // getBucketCount(21,3.25,2.5,1);
      //  getBucketCount(7.25, 4.3,2.35);
        getBucketCount(3.26, 0.75);
    }

}
