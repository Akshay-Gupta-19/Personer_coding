����   4 �
      java/lang/Object <init> ()V	  	 
   KickStartE19/Solution1 V I	     E  KickStartE19/Solution1$Edge	     edge [LKickStartE19/Solution1$Edge;
     (LKickStartE19/Solution1;)V	      KickStartE19/Solution1$subset parent
     ! find $([LKickStartE19/Solution1$subset;I)I	  # $  rank
 & ' ( ) * java/util/Arrays sort ([Ljava/lang/Object;)V
  	  - .  src	  0 1  dest
  3 4 5 Union %([LKickStartE19/Solution1$subset;II)V	  7 8  weight : java/util/Scanner	 < = > ? @ java/lang/System in Ljava/io/InputStream;
 9 B  C (Ljava/io/InputStream;)V
 9 E F G nextInt ()I
  I  J (II)V	 < L M N out Ljava/io/PrintStream; P java/lang/StringBuilder
 O  S Case #
 O U V W append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 O Y V Z (I)Ljava/lang/StringBuilder; \ : 
  ^ _ G 
KruskalMST
 O a b c toString ()Ljava/lang/String;
 e f g h i java/io/PrintStream println (Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this LKickStartE19/Solution1; i v e StackMapTable MethodParameters subsets  [LKickStartE19/Solution1$subset; x y xroot yroot 	next_edge LKickStartE19/Solution1$Edge; ans result  u main ([Ljava/lang/String;)V j n m g en args [Ljava/lang/String; sc Ljava/util/Scanner; t � 
SourceFile 	Q1_3.java InnerClasses Edge subset                               j   3     *� �    k   
       l        m n      J  j   �     5*� *� *� **� � � >� *� � Y*� S����    k   "    J  K 	 L  M  N   O . N 4 P l   *    o     5 m n     5 p     5 q   r    �     �  s   	 p   q       !  j   q     "+2� � +2*++2� � � +2� �    k       W 
 X  Z l        " m n     " t u    " o   r     s   	 t   o     4 5  j   �     a*+� 6*+� 6+2� "+2� "� +2� � 6+2� "+2� "� +2� � +2� +2Y� "`� "�    k   & 	   a  b  f ! g - h > i J o S p ` r l   >    a m n     a t u    a v     a w    Y x    Q y   r   	 � - s    t   v   w     _ G  j  4  	  
<*� � M>66*� � ,� Y*� S����*� � %*� � :6*� � � Y*� +S����6*� � 2� 2� "����6*� d� Y� Y*� :*� �� E*� �2:*� ,� 6*� /� 6� ,�S*� 2���6� ,2� 6`<����*� ddh`�    k   ~    w  x 
 y  z  {  | ' { - � 4 � = � I � V � \ � h � r � { � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � l   f 
 _ " p   � I z {  � & v   �  w    
 m n    |   
  }    � q    � o   = � t u  r   ( �    ~  �  � � !� \ 	 � �  j  �     ϻ 9Y� ;� AL+� D=>� �+� D6+� D6� Y� H:66� h+� Dd6	+� Dd6
� 2	� ,� 2
� /� 2� 6� 2	� ,� 2
� /� �2� 6����� K� OY� QR� T� X[� T� ]� X� `� d���G�    k   N    �  �  �  �  � # � 0 � 3 � = � M � Z � g � s � � � � � � � � � � � � � l   p  E W v  	 M O w  
 6 l �    � �   # � �   0 � � n  3 � �    � o     � � �    � � �   � �   r   1 �  9� # 	 � 9   � k� +  � 9   s    �    �    � �       �     �  