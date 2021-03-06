package org.printing.fortuneApi.Service;

import java.util.ArrayList;
import java.util.Random;

import org.printing.fortuneApi.contract.IEpigramProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class StaticEpigramProvider implements IEpigramProvider{
    private static final ArrayList<String> epigrams;

    @Override
    public String GetRandomEpigram(){
        Random random = new Random();
        int randomWithNextInt = random.nextInt(epigrams.size());
        return epigrams.get(randomWithNextInt);
    } 
    public static StaticEpigramProvider getInatance(){
        return new StaticEpigramProvider();
    } 
    static {
        epigrams = new ArrayList<String>(); ;
        epigrams.add("Some men are discovered; others are found out.");
        epigrams.add("Words must be weighed, not counted.");
        epigrams.add("By failing to prepare, you are preparing to fail.");
        epigrams.add("He who spends a storm beneath a tree, takes life with a grain of TNT.");
        epigrams.add("You attempt things that you do not even plan because of your extreme stupidity.");
        epigrams.add("Take care of the luxuries and the necessities will take care of themselves.");
        epigrams.add("Words are the voice of the heart.");
        epigrams.add("Your mind understands what you have been taught; your heart, what is true.");
        epigrams.add("A king's castle is his home.");
        epigrams.add("He who has a shady past knows that nice guys finish last.");
        epigrams.add("The universe is laughing behind your back.");
        epigrams.add("The best prophet of the future is the past.");
        epigrams.add("It is a poor judge who cannot award a prize.");
        epigrams.add("Even the boldest zebra fears the hungry lion.");
        epigrams.add("Money will say more in one moment than the most eloquent lover can in years.");
        epigrams.add("Money may buy friendship but money can not buy love.");
        epigrams.add("Might as well be frank, monsieur. It would take a miracle to get you out of Casablanca.");
        epigrams.add("Creditors have much better memories than debtors.");
        epigrams.add("Many pages make a thick book.");
        epigrams.add("Every purchase has its price.");
        epigrams.add("Do not underestimate the power of the Force.");
        epigrams.add("You will step on the night soil of many countries.");
        epigrams.add("Mind your own business, Spock. I'm sick of your halfbreed interference.");
        epigrams.add("He who invents adages for others to peruse takes along rowboat when going on cruise.");
        epigrams.add("Of all forms of caution, caution in love is the most fatal.");
        epigrams.add("If you suspect a man, don't employ him.");
        epigrams.add("The Tree of Learning bears the noblest fruit, but noble fruit tastes bad.");
        epigrams.add("Stop searching forever. Happiness is unattainable.");
        epigrams.add("A man who fishes for marlin in ponds will put his money in Etruscan bonds.");
        epigrams.add("A good memory does not equal pale ink.");
        epigrams.add("How sharper than a hound's tooth it is to have a thankless serpent.");
        epigrams.add("You dialed 5483");
        epigrams.add("It's later than you think.");
        epigrams.add("Mistakes are oft the stepping stones to failure.");
        epigrams.add("It's not reality that's important, but how you perceive things.");
        epigrams.add("Promptness is its own reward, if one lives by the clock instead of the sword.");
        epigrams.add("Like winter snow on summer lawn, time past is time gone.");
        epigrams.add("Far duller than a serpent's tooth it is to spend a quiet youth.");
        epigrams.add("Let not the sands of time get in your lunch.");
        epigrams.add("The attacker must vanquish; the defender need only survive.");
        epigrams.add("Standing on head makes smile of frown, but rest of face also upside down.");
        epigrams.add("Deprive a mirror of its silver and even the Czar won't see his face.");
        epigrams.add("Man's horizons are bounded by his vision.");
        epigrams.add("To criticize the incompetent is easy; it is more difficult to criticize the competent.");
        epigrams.add("He who has imagination without learning has wings but no feet.");
        epigrams.add("Men seldom show dimples to girls who have pimples.");
        epigrams.add("Troglodytism does not necessarily imply a low cultural level.");
        epigrams.add("You cannot kill time without injuring eternity.");
        epigrams.add("As goatherd learns his trade by goat, so writer learns his trade by wrote.");
        epigrams.add("One man tells a falsehood, a hundred repeat it as true.");
        epigrams.add("Crazee Edeee, his prices are INSANE!!!");
        epigrams.add("It is better to wear out than to rust out.");
        epigrams.add("When the wind is great, bow before it; when the wind is heavy, yield to it.");
        epigrams.add("The wise shepherd never trusts his flock to a smiling wolf.");
        epigrams.add("It is the wise bird who builds his nest in a tree.");
        epigrams.add("How you look depends on where you go.");
        epigrams.add("A plucked goose doesn't lay golden eggs.");
        epigrams.add("A man who turns green has eschewed protein.");
        epigrams.add("Put not your trust in money, but put your money in trust.");
        epigrams.add("Even a hawk is an eagle among crows.");
        epigrams.add("Even the smallest candle burns brighter in the dark.");
        epigrams.add("People who take cat naps don't usually sleep in a cat's cradle.");
        epigrams.add("A truly wise man never plays leapfrog with a Unicorn.");
        epigrams.add("Do not clog intellect's sluices with bits of knowledge of questionable uses.");
        epigrams.add("Let him who takes the Plunge remember to return it by Tuesday.");
        epigrams.add("Try to divide your time evenly to keep others happy.");
        epigrams.add("You have mail.");
        epigrams.add("His heart was yours from the first moment that you met.");
        epigrams.add("Sin has many tools, but a lie is the handle which fits them all.");
        epigrams.add("Let a fool hold his tongue and he will pass for a sage.");
        epigrams.add("With clothes the new are best, with friends the old are best.");
        epigrams.add("He is truly wise who gains wisdom from another's mishap.");
        epigrams.add("Beware of a dark-haired man with a loud tie.");
        epigrams.add("Today is the last day of your life so far.");
        epigrams.add("Flee at once, all is discovered.");
        epigrams.add("Man who falls in vat of molten optical glass makes spectacle of self.");
        epigrams.add("Go directly to jail. Do not pass Go, do not collect $200.");
        epigrams.add("For a good time, call 8367-3100.");
        epigrams.add("Those who can, do; those who can't, simulate.");
        epigrams.add("Those who can, do; those who can't, write. Those who can't write work for the Bell Labs Record.");
        epigrams.add("God does not play dice.");
        epigrams.add("This fortune is inoperative. Please try another.");
        epigrams.add("Laugh, and the world ignores you. Crying doesn't help either.");
        epigrams.add("No amount of genius can overcome a preoccupation with detail.");
        epigrams.add("You will feel hungry again in another hour.");
        epigrams.add("You now have Asian Flu.");
        epigrams.add("God made the integers; all else is the work of Man.");
        epigrams.add("Disk crisis, please clean up!");
        epigrams.add("You auto buy now.");
        epigrams.add("Many are called, few are chosen. Fewer still get to do the choosing.");
        epigrams.add("Try the Moo Shu Pork. It is especially good today.");
        epigrams.add("Many are cold, but few are frozen.");
        epigrams.add("The early worm gets the bird.");
        epigrams.add("He who hesitates is sometimes saved.");
        epigrams.add("Time is nature's way of making sure that everything doesn't happen at once.");
        epigrams.add("The future isn't what it used to be. (It never was.)");
        epigrams.add("Can't open /usr/lib/fortunes.");
        epigrams.add("If God had wanted you to go around nude, He would have given you bigger hands.");
        epigrams.add("It is better to have loved and lost than just to have lost.");
        epigrams.add("A journey of a thousand miles begins with a cash advance from Sam.");
        epigrams.add("Disk crunch - please clean up.");
        epigrams.add("Center meeting at 4pm in 2C-543");
        epigrams.add("I will never lie to you.");
        epigrams.add("Spock: We suffered 23 casualties in that attack, Captain.");
        epigrams.add("Your computer account is overdrawn. Please reauthorize.");
        epigrams.add("1 bulls, 3 cows");
        epigrams.add("It's hard to get ivory in Africa, but in Alabama the Tuscaloosa.");
        epigrams.add("Waste not, get your budget cut next year.");
        epigrams.add("Old MacDonald had an agricultural real estate tax abatement.");
        epigrams.add("Snow Day - stay home.");
        epigrams.add("Save gas, don't eat beans.");
        epigrams.add("All that glitters has a high refractive index.");
        epigrams.add("Ignore previous fortune.");
        epigrams.add("When in doubt, lead trump.");
        epigrams.add("unix soit qui mal y pense");
        epigrams.add("Even a cabbage may look at a king.");
        epigrams.add("Honi soit la vache qui rit.");
        epigrams.add("No directory");
        epigrams.add("Don't eat yellow snow.");
        epigrams.add("One Bell System - it works.");
        epigrams.add("One Bell System - it sometimes works.");
        epigrams.add("* UNIX is a Trademark of Bell Laboratories.");
        epigrams.add("chess tonight");
        epigrams.add("External Security:");
        epigrams.add("Peters hungry, time to eat lunch.");
        epigrams.add("MOUNT TAPE U1439 ON B3, NO RING");
        epigrams.add("A foolish consistency is the hobgoblin of little minds.");
        epigrams.add("IOT trap -- core dumped");
        epigrams.add("IOT trap -- mos dumped");
        epigrams.add("/usr/news/gotcha");
        epigrams.add("Rotten wood can not be carved - Confucius (Analects, Book 5, Ch. 9)");
        epigrams.add("System going down at 1:45 this afternoon for disk crashing.");
        epigrams.add(": is not an identifier");
        epigrams.add("Quantity is no substitute for quality, but its the only one we've got.");
        epigrams.add("Those who can do, those who can't, write.");
        epigrams.add("The more things change, the more they'll never be the same again.");
        epigrams.add("New crypt. See /usr/news/crypt.");
        epigrams.add("You might have mail.");
        epigrams.add("You can't go home again, unless you set $HOME");
        epigrams.add("You are in a maze of twisty little passages, all alike.");

    }
}
