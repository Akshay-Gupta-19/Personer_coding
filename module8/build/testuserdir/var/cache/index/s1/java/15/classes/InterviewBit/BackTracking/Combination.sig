����   4 s
      java/lang/Object <init> ()V
  	 
   %InterviewBit/BackTracking/Combination binomialCoeff (II)I  [[I  java/util/ArrayList
  
     comb (IIILjava/util/ArrayList;[[I)V	      java/lang/System out Ljava/io/PrintStream;  java/lang/StringBuilder
  
    ! " append (I)Ljava/lang/StringBuilder; $  
  & ! ' -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 ) * + , - java/util/Arrays toString ([I)Ljava/lang/String;
  / , 0 ()Ljava/lang/String;
 2 3 4 5 6 java/io/PrintStream println (Ljava/lang/String;)V
  8 9 : size ()I	  < = > ci I
  @ A B get (I)Ljava/lang/Object; D java/lang/Integer
 C F G : intValue
 C I J K valueOf (I)Ljava/lang/Integer;
  M N O add (Ljava/lang/Object;)Z
 C Q  R (I)V
  T U O remove Code LineNumberTable LocalVariableTable this 'LInterviewBit/BackTracking/Combination; main ([Ljava/lang/String;)V i args [Ljava/lang/String; A B ans al Ljava/util/ArrayList; LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; StackMapTable _ MethodParameters n k res cn 	Signature 3(IIILjava/util/ArrayList<Ljava/lang/Integer;>;[[I)V <clinit> 
SourceFile Combination.java !       = >        V   /     *� �    W        X        Y Z   	 [ \  V   �     V<=� � N� Y� :-� 6-�� -� � Y� � #� %-2� (� %� .� 1���ұ    W   "           !  +  O  U  X   >  $ 1 ] >    V ^ _    T ` >   R a >   G b    > c d  e      > c f  g    � $  h    � 0 i    ^       V   �     (=d� d<>� dh=`l=�����    W   "       	    #  %  &   # & ) X   *    ] >    ( j >     ( k >   & l >  g    � � �  i   	 j   k       V       t-� 7d``� �-� 7� 36-� 7� � ;2-� ?� C� EO���߲ ;`� ;�-� H� LW`-� -� CY� P� SW`-� �    W   2    ,  -  . # / 8 . > 1 F 2 G 4 P 5 [ 6 h 7 s 8 X   >   $ ] >    t ` >     t a >    t m >    t c d    t b   e       t c f  g    � 
� # i    `   a   m   c   b   n    o  p   V         � ;�    W         q    r