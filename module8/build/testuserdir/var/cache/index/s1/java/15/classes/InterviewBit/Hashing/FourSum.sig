����   4 s
      java/lang/Object <init> ()V
  	 
   java/util/Arrays parallelSort ([I)V  java/util/HashSet
    java/util/ArrayList
  
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
     add (Ljava/lang/Object;)Z
  
     ! size ()I # [[I
  % & ' iterator ()Ljava/util/Iterator; ) * + , - java/util/Iterator hasNext ()Z ) / 0 1 next ()Ljava/lang/Object;
  3 4 5 get (I)Ljava/lang/Object;
  7 8 ! intValue	 : ; < = > java/lang/System out Ljava/io/PrintStream;
  @ A B toString ([I)Ljava/lang/String;
 D E F G H java/io/PrintStream println (Ljava/lang/String;)V
   K InterviewBit/Hashing/FourSum Code LineNumberTable LocalVariableTable this LInterviewBit/Hashing/FourSum; main ([Ljava/lang/String;)V nal Ljava/util/ArrayList; l I r cs j i cal args [Ljava/lang/String; A [I B al Ljava/util/HashSet; ans it Ljava/util/Iterator; LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; ?Ljava/util/HashSet<Ljava/util/ArrayList<Ljava/lang/Integer;>;>; @Ljava/util/Iterator<Ljava/util/ArrayList<Ljava/lang/Integer;>;>; StackMapTable ] _ MethodParameters rmDup ([I)[I arr 
SourceFile FourSum.java ! J           L   /     *� �    M        N        O P   	 Q R  L  #  
  ��
YOYOYOYOY�OYOL=+� � Y� N6+�� �`6+�� �`6+�d6+.+.`6� |+.`+.`� 	����+.`+.`� 	����л Y� :		+.� � W	+.� � W	+.� � W	+.� � W-	� W���������_���L-� � ":-� $:6� ( � a� . � :2� 2� � 6O2� 2� � 6O2� 2� � 6O2� 2� � 6O����6�� � 92� ?� C����    M   ~          $  ,  6  C  O  Z  a  w  �  �  �  �   � ! �  �  � % � & � ' ( )# *6 +I ,\ 'b /m 0{ /� 2 N   �  � A S T 	 I � U V  O � W V  Z � X V  < � Y V  / � Z V  L [ T  � h Z V e  Z V   � \ ]   d ^ _   b ` V  ,V a b  � � c #  � � d e  f   *  � A S g 	 L [ g  ,V a h  � � d i  j   = � /  k l   � � � L� � �  " )� g� �  m    \    n o  L       n� Y� L+*.� � W=*�� 1*�� *.*d.� 	����*�� +*.� � W����+� I�
M>,�� ,+� 2� � 6O����,�    M   .    4  5  6  7 2 8 C 6 I : P ; X < f ; l > N   4   4 Z V  R  Z V    n p _    f a T  P  c _  f      f a g  j    �  � �  l�  m    p    q    r