package kg.megacom;


import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        String s = "\n" +
                "\n" +
                "Александр Пушкин\n" +
                "У лукоморья дуб зеленый\n" +
                "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" +
                "Стоит без окон, без дверей;\n" +
                "Там лес и дол видений полны;\n" +
                "Там о заре прихлынут волны\n" +
                "На брег песчаный и пустой,\n" +
                "И тридцать витязей прекрасных\n" +
                "Чредой из вод выходят ясных,\n" +
                "И с ними дядька их морской;\n" +
                "Там королевич мимоходом\n" +
                "Пленяет грозного царя;\n" +
                "Там в облаках перед народом\n" +
                "Через леса, через моря\n" +
                "Колдун несёт богатыря;\n" +
                "В темнице там царевна тужит,\n" +
                "А бурый волк ей верно служит;\n" +
                "Там ступа с Бабою Ягой\n" +
                "Идёт, бредёт сама собой,\n" +
                "Там царь Кащей над златом чахнет;\n" +
                "Там русский дух… там Русью пахнет!\n" +
                "И там я был, и мёд я пил;\n" +
                "У моря видел дуб зелёный;\n" +
                "Под ним сидел, и кот учёный\n" +
                "Свои мне сказки говорил.\n" +
                "\n" +
                "Отрывок из поэмы «Руслан и Людмила».";
        TreeSet<String> lukomorie = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String first = o1.toString();
                String second = o2.toString();
                return second.compareTo(first);
            }
        });
        StringTokenizer st = new StringTokenizer(s, "A-Z !,?._'@;:«»—()…\"\t\n\r");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            lukomorie.add(st.nextToken());
        }
        for (String value : lukomorie) {
            System.out.println(value);
        }









    }
}
