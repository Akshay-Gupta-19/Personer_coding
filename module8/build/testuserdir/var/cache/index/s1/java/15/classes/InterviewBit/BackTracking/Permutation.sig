����   4 f
      java/lang/Object <init> ()V
  	 
   %InterviewBit/BackTracking/Permutation fact (I)I  [[I  java/util/ArrayList
  
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
     add (Ljava/lang/Object;)Z
     per !([I[I[[I[ILjava/util/ArrayList;)V	 ! " # $ % java/lang/System out Ljava/io/PrintStream;
 ' ( ) * + java/util/Arrays toString ([I)Ljava/lang/String;
 - . / 0 1 java/io/PrintStream println (Ljava/lang/String;)V
  3 4 5 isEmpty ()Z
  7 8 9 size ()I
  ; < = get (I)Ljava/lang/Object;
  ? @ 9 intValue
  B C = remove
  E  F (ILjava/lang/Object;)V Code LineNumberTable LocalVariableTable this 'LInterviewBit/BackTracking/Permutation; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; A [I pi pii ans cia al Ljava/util/ArrayList; LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; StackMapTable Q S MethodParameters a x 	Signature 6([I[I[[I[ILjava/util/ArrayList<Ljava/lang/Integer;>;)V 
SourceFile Permutation.java !            G   /     *� �    H        I        J K   	 L M  G  k     |�
YOYOYOL+��
M�
N+�� +�� :�
:� Y� :6+�� +.� � W����,-� 6�� �  2� &� ,����    H   :           &  +  4  >  K  Q  \  g  u  {  I   \ 	 7  N O  _  N O    | P Q    l R S   g T S   c U S  & V V   + Q W S  4 H X Y  Z     4 H X [  \   ) � 7  ] ^ ^ ^  ^   � � �  _    P       G   s     <=� h<�����    H          ! 	 "  !  $ I        N O     ` O     V O  \   
 � �  _    `       G  V     �� 2� '6*�� ,-.2*.O����-\.`O�6� 6� J� :� � >6*+.O+\.`O� AW*+,-� � � D+\.dO�����    H   B    '  (  )  ( $ + + , , . 9 / H 0 O 1 V 2 ^ 3 g 4 s 5 z . � 7 I   R    N O  H 2 a O  / Q N O    � T S     � U S    � V     � W S    � X Y  Z       � X [  \    � � � � P _    T   U   V   W   X   b    c  d    e