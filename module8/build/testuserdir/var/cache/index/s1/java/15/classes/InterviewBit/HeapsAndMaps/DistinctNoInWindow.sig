����   4 K
      java/lang/Object <init> ()V  java/util/ArrayList
    java/util/HashMap
 
 
     get (I)Ljava/lang/Object;  java/lang/Integer
     valueOf (I)Ljava/lang/Integer;
 
    getOrDefault 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     intValue ()I
 
   !  put
 
 # $  size
  & ' ( add (Ljava/lang/Object;)Z
  #
 
 +  , &(Ljava/lang/Object;)Ljava/lang/Object;
 
 . / , remove 1 ,InterviewBit/HeapsAndMaps/DistinctNoInWindow Code LineNumberTable LocalVariableTable this .LInterviewBit/HeapsAndMaps/DistinctNoInWindow; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; A Ljava/util/ArrayList; B hm Ljava/util/HashMap; ans LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; ;Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>; StackMapTable < MethodParameters 
SourceFile DistinctNoInWindow.java ! 0           2   /     *� �    3        4        5 6   	 7 8  2  �     � Y� 	L=� 
Y� N6� 0-+� � -+� � � � � `� � W���л Y� 	:-� "� � %W6+� )� �-+d� � -+d� � *� � d� � W-+d� � *� � � -+d� � -W-+� � -+� � � � � `� � W-� "� � %W���w�    3   :     
      B  H  Q  ^  j  �  �  �  �  �  4   H   3 9 :  a � 9 :    � ; <    � = >  
 � ? :   � @ A  Q � B >  C       � = D   � @ E  Q � B D  F   $ �   G  
  � 2�  � Q� 9 H    ;    I    J