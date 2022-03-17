# Patika dev Merge Sort Projesi

## Merge Sort Nedir?

Merge Sort (Birleştirme Sıralaması), diziyi ardışık olarak en küçük alt dizilerine kadar yarılayan sonra da onları sıraya koyarak bireştiren özyineli bir algoritmadır. Yarılama işlemi en büyük alt dizi en çok iki öğeli olana kadar sürer. Sonra "Merge (Birleştirme)" işlemiyle altdiziler ikişer ikişer bölünüş sırasıyla sıralı olarak bir üst dizide bireşir. Süreç sonunda en üstte sıralı diziye ulaşılır.

---
## Merge Sort Sözel Çalışma Mantığı

1. Sıralı olmayan diziyi ortadan eşit olarak iki alt diziye ayırır.
2. Bu ayırma işlemi, alt diziler en çok iki elemanlı olana kadar devam eder.
3. Alt dizileri kendi içinde sıralar.
4. Sıralı iki alt diziyi tek bir sıralı dizi olacak şekilde birleştirir.
---

## Java ile yazılmış örnek kod bloğu

>PatikaMergeSort.java adlı dosyada kodun orijinal hali bulunmaktadır.

```java
import java.util.Arrays;

class PatikaMergeSort {


  void merge(int array[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    for (int i = 0; i < n1; i++)
      L[i] = array[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = array[q + 1 + j];

    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        array[k] = L[i];
        i++;
      } else {
        array[k] = M[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = M[j];
      j++;
      k++;
    }
  }

  void mergeSort(int array[], int left, int right) {
    if (left < right) {

      
      int mid = (left + right) / 2;

      
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);

      
      merge(array, left, mid, right);
    }
  }

  public static void main(String args[]) {

    
    int[] array = { 16, 21, 11, 8, 12, 22};

    PatikaMergeSort ob = new PatikaMergeSort();


    ob.mergeSort(array, 0, array.length - 1);

    System.out.println("Merge Sort işlemi uygulandı:");
    System.out.println(Arrays.toString(array));
  }
}
```
---
## Örnek Kodu Çıktısı
![MergeSortOutOutput]()

---

## Verilen dizinin merge sort aşamaları

* Soruda verilen dizinin ilk hali
```
                [16,21,11,8,12,22] 
```
---
* Merge sort ile birlikte dizi orta indisten iki parçaya ayrılır.
```
        [16][21][11]        [8][2][22]
 ```
 ---

* Sonrasında her iki branchteki diziler de kendi içlerinde ayrılma işlemi devam eder
```
        [16][21][11]         [8][2][22]

       [16]  [21,11]   	     [8]  [12,22]	
 ```
 ---
* Her bir dizi tek eleman olacak şekilde üçüncü adımda ayrılma gerçekleşir.
```
        [16][21][11]         [8][2][22]

       [16]  [21,11]   	     [8]  [12,22]	

    [16]  [21]  [11]   	     [8]  [12]  [22]
  
 ```
 ---

 * Her dizi elemenı tek elemanlı diziler halinde ayrıldıktan sonra tekrar birleşme işlemi gerçekleşir. Bu işlem sırasında yeni oluşturulan diziler sıralı soldan sağ küçükten büyüğe olacak şekilde diziler sıralanır.

```
        [16][21][11]         [8][2][22]

       [16]  [21,11]   	     [8]  [12,22]	

    [16]  [21]  [11]   	     [8]  [12]  [22]

        [16,21] [11]         [8,12] [22]
  
 ```
 ---

 * Sonraki adımda her iki branch tekrar 3 elemanlı diziler haline gelir.

 ```
        [16][21][11]         [8][2][22]

       [16]  [21,11]   	    [8]  [12,22]	

    [16]  [21]  [11]   	    [8]  [12]  [22]

        [16,21] [11]         [8,12] [22]

          [11,16,21]         [8,12,22]
  
 ```
 ---

* Son olarak iki parça sıralı bir şekilde bir araya gelir ve sıralanmış ana dizinimizi oluşturur.
```
        [16][21][11]         [8][2][22]

       [16]  [21,11]   	    [8]  [12,22]	

    [16]  [21]  [11]   	    [8]  [12]  [22]

        [16,21] [11]         [8,12] [22]

          [11,16,21]         [8,12,22]

                [8,11,12,16,21,22]

 ```
 ---

## Merge Sort Big-O gösterimi

```
Worst Case Karmaşıklığı: O(n*log n)

Best Case Karmaşıklığı: O(n*log n)

Average Karmaşıklığı: O(n*log n)
```
---

## Kaynakça
[Geekforgeeks](https://www.geeksforgeeks.org/merge-sort/)

[Khanacademy](https://www.khanacademy.org/computing/computer-science/algorithms/merge-sort/a/overview-of-merge-sort)

---



