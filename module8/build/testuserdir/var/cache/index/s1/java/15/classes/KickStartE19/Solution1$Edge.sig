����   4 G	      KickStartE19/Solution1$Edge this$0 LKickStartE19/Solution1;
  	 
   java/lang/Object <init> ()V	     src I	     dest	     weight
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
     ! " java/util/Objects hash ([Ljava/lang/Object;)I
  $ % & getClass ()Ljava/lang/Class;
  ( ) * 	compareTo  (LKickStartE19/Solution1$Edge;)I , java/lang/Comparable (LKickStartE19/Solution1;)V Code LineNumberTable LocalVariableTable this LKickStartE19/Solution1$Edge; MethodParameters (LKickStartE19/Solution1;III)V compareEdge hashCode ()I equals (Ljava/lang/Object;)Z obj Ljava/lang/Object; other StackMapTable (Ljava/lang/Object;)I 	Signature GLjava/lang/Object;Ljava/lang/Comparable<LKickStartE19/Solution1$Edge;>; 
SourceFile 	Q1_3.java InnerClasses E KickStartE19/Solution1 Edge      +                           -  .   >     
*+� *� �    /        0       
 1 2     
    3    �   4  .   |     *+� *� *� *� *� �    /        	        ! 0   4     1 2                           3    �           ) *  .   >     
*� +� d�    /       $ 0       
 1 2     
 5 2  3    5    6 7  .   F     � Y*� � SY*� � S� �    /       ' 0        1 2    8 9  .   �     ;*+� �+� �*� #+� #� �+� M*� ,� � �*� ,� � ��    /   2    +  ,  .  /  1  2  4  5 * 6 , 8 7 9 9 ; 0        ; 1 2     ; : ;    < 2  =    �   3    :  A ) >  .   3     	*+� � '�    /        0       	 1 2   3    5   ?    @ A    B C   
   D F  