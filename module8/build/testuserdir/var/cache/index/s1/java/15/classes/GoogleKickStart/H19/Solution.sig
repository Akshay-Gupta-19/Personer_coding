����   4 Z
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I	 
    out Ljava/io/PrintStream;  java/lang/StringBuilder
    Case #
    ! " append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  $ ! % (I)Ljava/lang/StringBuilder; ' : 
  ) * + toString ()Ljava/lang/String;
 - . / 0 1 java/io/PrintStream print (Ljava/lang/String;)V 3  
 5 6 7 8 9 java/lang/Math max (II)I
 5 ; < 9 min >  
 - @ A 1 println C GoogleKickStart/H19/Solution Code LineNumberTable LocalVariableTable this LGoogleKickStart/H19/Solution; main ([Ljava/lang/String;)V x I j n minTN i args [Ljava/lang/String; sc Ljava/util/Scanner; t StackMapTable MethodParameters 
SourceFile Hindex.java   B            D   /     *� �    E        F        G H   	 I J  D  M     �� Y� 	� L+� =>� x� � Y� � � #&� � (� ,+� 666� 9+� 6� � Y� 2� `� 4� #� (� ,� :6���Ʋ =� ?�����    E   :           5  ;  >  H  N  o  x  ~  �  �  F   R  N * K L  A = M L  ; K N L  > H O L   z P L    � Q R    � S T   } U L  V    �  � .� <�  W    Q    X    Y