package com.lucianomarinho.gtatorcidas.gt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.*;

public class TorcidasDetalhesActivity extends ActionBarActivity {
    private Integer[] TorcidasLogos = {
            R.drawable.ic_tjf, // 01
            R.drawable.ic_rrn, // 02
            R.drawable.ic_fjv, // 03
            R.drawable.ic_fjb, // 04
            R.drawable.ic_tjb, // 05
            R.drawable.ic_tyf, // 06
            R.drawable.ic_tff, // 07
            R.drawable.ic_ijv, // 08
            R.drawable.ic_ubz, // 09
            R.drawable.ic_tti, // 10
            R.drawable.ic_mv, //  11
            R.drawable.ic_gdf, // 12
            R.drawable.ic_tj, // 13
            R.drawable.ic_c12, // 14
            R.drawable.ic_ddr, // 15
            R.drawable.ic_p9, //  16
            R.drawable.ic_cma, // 17
            R.drawable.ic_tog, // 18
            R.drawable.ic_tpi, // 19
            R.drawable.ic_hsg, // 20
            R.drawable.ic_tof, // 21
            R.drawable.ic_iav, // 22
            R.drawable.ic_tfi, // 23
            R.drawable.ic_cms12, // 24
            R.drawable.ic_ppl, // 25
            R.drawable.ic_gdg, // 26
            R.drawable.ic_mvj, // 27
            R.drawable.ic_toga, // 28
            R.drawable.ic_ut, // 29
            R.drawable.ic_fjg, // 30
            R.drawable.ic_tev, // 31
            R.drawable.ic_tda, // 32
            R.drawable.ic_ijg, // 33
            R.drawable.ic_tfb, // 34
            R.drawable.ic_tor, // 35
            R.drawable.ic_tjfan, // 36
            R.drawable.ic_tjs, // 37
            R.drawable.ic_toic, // 38
            R.drawable.ic_fjy, // 39
            R.drawable.ic_tgi, // 40
            R.drawable.ic_torc, // 41
            R.drawable.ic_toca, // 42
            R.drawable.ic_tob, // 43
            R.drawable.ic_tui, // 44
            R.drawable.ic_jgt, // 45
            R.drawable.ic_tuf, // 46
            R.drawable.ic_toc, // 47
            R.drawable.ic_mofi, // 48
            R.drawable.ic_tmv, // 49
            R.drawable.ic_tga, // 50
            R.drawable.ic_fjba, // 51
            R.drawable.ic_tutb, // 52
            R.drawable.ic_tta, // 53
            R.drawable.ic_toma, // 54
            R.drawable.ic_tocar, // 55
            R.drawable.ic_tomn, // 56
            R.drawable.ic_tjga, // 57
            R.drawable.ic_tjbpb, // 58
            R.drawable.ic_tfj, // 59
            R.drawable.ic_tuv // 60
    };
    String[] TorcidasSiglas = {
            "TJF", //1
            "RRN", //2
            "FJV", //3
            "FJB", //4
            "TJB", //5
            "TYF", //6
            "TFF", //7
            "IJV", //8
            "UBZ", //9
            "TTI", //10
            "MV", //11
            "GDF", //12
            "TJ", //13
            "C12", //14
            "DDR", //15
            "P9", //16
            "CMA", //17
            "TOG", //18
            "TPI", //19
            "HSG", //20
            "TOF", //21
            "IAV", //22
            "TFI", //23
            "CMS12", //24
            "PPL", //25
            "GDG", //26
            "MVJ", //27
            "TOGA", //28
            "UT", //29
            "FJG", //30
            "TEV", //31
            "TDA", //32
            "IJG", //33
            "TFB", //34
            "TOR", //35
            "TJFan", //36
            "TJS", //37
            "TOIC", //38
            "FJY", //39
            "TGI", //40
            "TORC", //41
            "TOCA", //42
            "TOB", //43
            "TUI", //44
            "JGT", //45
            "TUF", //46
            "TOC", //47
            "MOFI", //48
            "TMV", //49
            "TGA", //50
            "FJBa", //51
            "TUTB", //52
            "TTA", //53
            "TOMA", //54
            "TOCAR", //55
            "TOMN", //56
            "TJGa", //57
            "TJBpb", //58
            "TFJ", //59
            "TUV" // TUV - 60
    };
    String[] TorcidasNomes = {
            "Torcida Jovem do Flamengo", // 1
            "Raça Rubro-Negra", // 2
            "Força Jovem do Vasco", // 3
            "Fúria Jovem do Botafogo", // 4
            "Torcida Jovem do Botafogo", // 5
            "Torcida Young Flu", // 6
            "Torcida Força Flu", // 7
            "Ira Jovem do Vasco", // 8
            "Urubuzada", // 9
            "Torcida Tricolor Independente", // 10
            "Mancha Verde", // 11
            "Gaviões da Fiel", // 12
            "Torcida Jovem do Santos", // 13
            "Camisa 12 do Corinthians", // 14
            "Dragões da Real", // 15
            "Pavilhão 9", // 16
            "Comando Máfia Azul", // 17
            "Torcida Organizada Galoucura", // 18
            "Torcida Pavilhão Independente", // 19
            "Torcida Fúria Independente HSG", // 20
            "Torcida Os Fanáticos", // 21
            "Império Alvi-Verde", // 22
            "Torcida Fúria Independente PR", // 23
            "Camisa 12 do Inter", // 24
            "Popular do Inter", // 25
            "Geral do Grêmio", // 26
            "Mancha Verde do Juventude", // 27
            "Torcida Organizada Gaviões Alvi-negros", // 28
            "União Tricolor", // 29
            "Força Jovem do Goiás", // 30
            "Torcida Esquadrão Vilanovense", // 31
            "Torcida Dragões Atleticanos", // 32
            "Ira Jovem do Gama", // 33
            "Torcida Facção Brasiliense", // 34
            "Torcida Organizada Rubra", // 35
            "Torcida Jovem Fanáutico", // 36
            "Torcida Jovem do Sport", // 37
            "Torcida Organizada Inferno Coral", // 38
            "Força Jovem do Ypiranga ", // 39
            "Torcida Gang da Ilha ", // 40
            "Torcida Organizada Raça Coral", // 41
            "Torcida Organizada Comando AlviNegro", // 42
            "Torcida Bamor", // 43
            "Torcida Uniformizada os Imbatíveis", // 44
            "Jovem Garra Tricolor", // 45
            "Torcida Uniformizada do Fortaleza", // 46
            "Torcida Organizada Cearamor", // 47
            "Movimento Organizado Força Independente", // 48
            "Torcida Máfia Vermelha", // 49
            "Torcida Garra Alvinegra", // 50
            "Fúria Jovem Baraúnas", // 51
            "Torcida Uniformizada Terror Bicolor", // 52
            "Torcida Trovão Azul", // 53
            "Torcida Organizada Mancha Azul", // 54
            "Torcida Organizada Comando Alvi Rubro", // 55
            "Torcida Organizada Mancha Negra", // 56
            "Torcida Jovem do Galo", // 57
            "Torcida Jovem do Botafogo PB", // 58
            "Torcida Facção Jovem", // 59
            "Torcida Uniformizada Viloucura" // TUV - 60
    };
    String[] TorcidasDir = {
            "Presidentes: Negão e Zulu;\n" +
            "Presidente de Honra: Pedrin;\n" +
            "Responsáveis por CF/X5: Zulu, Negão e Pedrin.", // TJF - 1
            "Presidente de Honra : Luiiz\n" +
            "Presidente: Brunin \n" +
            "Vice Presidente: Homer\n" +
            "Diretor geral: Need\n" +
            "Quem pode apostar CF /X5 : Luiiz , Brunin ,Homer e Need\n" +
            "Cargos in-game:\n" +
            "ORGs: Luiiz, Brunin e Homer\n" +
            "PUXs: Godoy , Deco e Need", // RRN - 2
            "Presidente: JN\n" +
            "Vice Presidente: Plonc\n" +
            "Diretor Geral: Mag\n" +
            "Responsáveis por marcar x5 e CF: JN, Plonc e Mag.", // FJV - 3
            "Presidente de Honra: Peeman & Kurt\n" +
            "Presidente: Head\n" +
            "Vice Presidente: General\n" +
            "Diretor Geral: Cadu\n" +
            "Responsáveis por marcar x5 e CF: Peeman, Kurt, Head, General e Cadu", // FJB - 4
            "DIRETORIA NÃO INFORMADA NO FORUM", // TJB - 5
            "Presidentes: FreitaG e Caruso (Dark)\n" +
            "Vice-Presidente: Zé e Wllc\\n\" +\n" +
            "Diretor Geral: Cocota (CCT.RGT)", // TYF - 6
            "Presidentes de Honra: Ret e NieL\n" +
            "Presidente : Penoso (Ruan Duarte)\\n\" +\n" +
            "Vice Presidente : Nunes (Victor Nunes)\\n\" +\n" +
            "Conselheiro: PedroSG (Pedro Nascimento)\\n\" +\n" +
            "Diretor : City (iCity Paiva)\\n\" +\n" +
            "Diretor de Divulgação & Responsável pelos Novatos: City(iCity Paiva) & Krim (Victor Santos)\\n\" +\n" +
            "Líder Quadrilha de x5: Nunes (Victor Nunes)\\n\" +\n" +
            "Responsável por Marcar CF / x5: Penoso & Nunes", // TFF - 7
            "DIRETORIA NÃO INFORMADA NO FORUM", // IJV - 8
            "Presidente: Rhino - Victor.1BTL\n" +
            "Vice Presidente: \n" +
            "Diretores: PedrinLBTR\n" +
            "Quem pode marcar CF / X5: Rhino", // UBZ - 9
            "Presidente: GFT\n" +
            "Vice-Presidente: Chs\n" +
            "Diretor Geral: Sml\n" +
            "Coordenadores: Jacks, FLP e BoZo\n" +
            "Responsáveis por apostar materiais (x5, CF): GFT e Chs", // TTI - 10
            "PRESIDENTES: Robson e Ronaldo.\n" +
            "VICE-PRESIDENTE: VitãoCJ.\n" +
            "DIRETORES: Markola, Camatta, Ens, Guikerwn e Roots.\n" +
            "CONSELHO ATIVO: CROBr, Hélio, Paulo e Vini.\n" +
            "CONSELHO INATIVO: Higuera e Filipe.\n" +
            "APOSTAS DE MATERIAIS: Ronaldo, Robson, CroBr, Camatta, Ens, Vitão.", // MV - 11
            "Presidente: Iuri\n" +
            "Vice Presidente: Arthur\n" +
            "Diretores: Visa & Wolf\n" +
            "Responsáveis por marcar x5 e CF: Iuri, Arthur & Visa.", // GDF - 12
            "Diretoria:\n" +
            "Presidente: Guillen & Pedro\n" +
            "Vice Presidente: FlaTs\n" +
            "Responsáveis pelos Eventos: Guillen e Pedro\n" +
            "Responsáveis pelas Apostas: Guillen e Pedro\n" +
            "Responsáveis pela ETT: Pedro e Brunin\n" +
            "Responsável pelo Patch: Breno \n" +
            "Organizadores e Puxadores:\n" +
            "Organizadores: Guillen, Pedro e FlaTs\n" +
            "Puxadores:  André, Tato e Brunin", // TJ - 13
            "DIRETORIA NÃO INFORMADA NO FORUM", // C12 - 14
            "Presidente: Teeu\n" +
            "Vice Presidente: Arthur\n" +
            "Diretor Geral: DJMt\n" +
            "Responsáveis por marcar x5 e CF: Teeu", // DDR - 15
            "Presidente: Nildão\n" +
            "Vice Presidente: Lemes\n" +
            "Diretor Geral: Salama\n" +
            "Responsáveis por marcar x5 e CF: Nildão, Lemes e Salama", // P9 - 16
            "Presidentes: Igor (Iguin) | Higor (Higor)\n" +
            "Vice Presidente: Caiio (Santos)\n" +
            "Diretor Geral: Geomar (Geeo)\n" +
            "Diretores: Jean (Jean) | Natan (sapo) | Joao (Joao) | Henrique (Quik)\n" +
            "Responsavél CF: Iguin , Higor e Caiio.\n" +
            "Responsável X5:  Iguin , Caiio , Higor, Geeo e Sapo", // CMA - 17
            "Presidentes : Vieira , Snoop e Cori\n" +
            "Vice-Presidentes : Shax e Daniel\n" +
            "Responsáveis Por Apostas : Presidentes E Vices", // TOG - 18
            "Presidente de Honra.:  FBM [Fabio Thadeu] &amp; FS [Fábio Stralioti]\n" +
            "Presidente.: [TPI]Craaj.PFT[ORG]\n" +
            "Vice-Presidente.: [TPI]Sr_vPres[PUX]\n" +
            "Diretor Geral.: [TPI]Trs.PFT[UPC]\n" +
            "Diretores & Conselheiros.: \n" +
            "Designer de Montagens/Patch: [TPI]Marcus/Stil\n" +
            "Organizadores.:  [TPI]Craaj.PFT[ORG]\n" +
            "Puxadores.: [TPI]Sr_vPres[PUX]\n" +
            "Membros Eternos:\n" +
            "#FBM   #Zlife  #Batista  #Ruffles  #Akiles #FS  #Peixe #Zhai", // TPI - 19
            "DIRETORIA NÃO INFORMADA NO FORUM", // HSG - 20
            "Presidente: Du\n" +
            "Vice Presidente: Jhou e Marcão\n" +
            "Responsáveis por marcar x5 e CF: Du e todos acima", // TOF - 21
            "Presidentes: Lucas, Guiih e Dilcin.\n" +
            "Vice Presidentes: Luis e Marino.\n" +
            "Diretores Gerais: Castor e Slap.\n" +
            "Responsáveis por marcar x5 e CF: Lucas, Guiih, Dilcin, Luis e Marino.", // IAV - 22
            "Presidente de Honra: Lk , Lost, ADL , Thi , Bueno  \n" +
            "Presidente: [TFI]Heeen.PRES[ORG]\n" +
            "Diretor Geral:  [TFI]Zezin.DRT[2BTL] \n" +
            "Organizador : \n" +
            "[TFI]Heeen.PRES[ORG]\n" +
            "Puxadores :\n" +
            "[TFI]Leo.PRES[PUX]\n" +
            "[TFI]GUII.LLDF[PUX]\n" +
            "Responsáveis por apostar matérias\n" +
            "Heeen e Leo", // TFI - 23
            "DIRETORIA NÃO INFORMADA NO FORUM", // CMS12 - 24
            "Capo/Presidente: Soares\n" +
            "Vice Capo/Vice Presidente:  Rick ｡ Z1K4\n" +
            "Conselheiros (Diretoria): Giggs, Alemao, Simoes, Dodo｡\n" +
            "Diretor Geral : Dodo\n" +
            "Autorizados a apostar CF/X5 : Rick,Soares,Weslei,Z1K4", // PPL - 25
            "Presidente: Jops\n" +
            "Vice Presidente: Deanz\n" +
            "Diretor Geral: Gu$t\n" +
            "Responsáveis por marcar x5 e CF: Jops, Deanz, Gu$t, VLH, Thug e Drews", // GDG - 26
            "DIRETORIA NÃO INFORMADA NO FORUM", // MVJ - 27
            "Presidente de Honra: LEO\n" +
            "Presidente: MANI\n" +
            "Vice-Presidente: BT\n" +
            "Diretor Geral: Venom, BZ\n" +
            "Diretoria: Brayan\n" +
            "Responsável por marcar CF: LEO, MANI\n" +
            "Responsável por marcar X5: LEO, MANI, Venom", // TOGA - 28
            "DIRETORIA NÃO INFORMADA NO FORUM", // UT - 29
            "Presidente: [FJG]Dimenor\n" +
            "Vice Presidente: [FJG]Fluxo\n" +
            "Diretor Geral: [FJG]Orkut\n" +
            "Responsáveis por marcar x5 e CF: [FJG]Dimenor e [FJG]Fluxo", // FJG - 30
            "Presidente: [TEV]Nando.PRESH\n" +
            "Vice - Presidente: [TEV]Batore.\n" +
            "Diretores Gerais: [TEV]Hallowen & [TEV]Felipe.\n" +
            "Responsáveis por marcar Confrontos & X5: [TEV]DuDuH, [TEV]Nando & [TEV]Batore.", // TEV - 31
            "Presidente: Deny,GB(TEMPORARIO)\n" +
            "Vice Presidente: DaaC\n" +
            "Diretor Geral: GB\n" +
            "Responsáveis por marcar x5 e CF: GB,Deny,Lokin,Lucas,DaaC", // TDA - 32
            "Presidente: Skot\n" +
            "Vice Presidente: HF\n" +
            "Diretor Geral: Refen\n" +
            "Responsáveis por marcar x5 e CF: Refen, Distru, Fenix e Buti", // IJG - 33
            "Presidentes de Honra: \n" +
            "Kalt , Rafa , Leko , Frald\n" +
            "Presidente:\n" +
            "Frald\n" +
            "Vice Presidente:\n" +
            "NEM & S3D4\n" +
            "Diretor Geral: \n" +
            "Pantry & FakoT\n" +
            "Responsáveis Por Apostar Material :\n" +
            "Frald & Phil", // TFB - 34
            "Presidente : Diego Oliveira [TOR]Dii.MMA[PRES]\n" +
            "Vice-Presidente : Victor ViNi [TOR]Vity.ZS[PRES] , Lucas Olimpio [TOR]Olp.PRESH[1BTL]\n" +
            "Diretores Importantes: [TOR]Machado.ZS[PUXT , [TOR]Luan.MMA[DRT] , [TOR]NeGuin.MMA[SUP]\n" +
            "Quem Aposta Materiais: [TOR]LOBAO.AAA[2BTL] , [TOR]Olp.PRESH[1BTL] , [TOR]Dii.MMA[PRES]", // TOR - 35
            "Presidentes de Honra: Lipe,Peixe,Krg e Delta.\n" +
            "Presidente: Lipe\n" +
            "Vice Presidente: Hugo\n" +
            "Diretor Geral: Kiler,Cabeça,JV84,Hagner e MJR.\n" +
            "Responsáveis por marcar x5 e CF: Lipe, Hugo,Kiler e Cabeça.", // TJFan - 36
            "Presidente: Guga\n" +
            "Vice Presidente: Ti0 & Brendo\n" +
            "Diretor Geral: Verton & RML\n" +
            "Responsáveis por marcar x5 e CF: Guga - Igoor - Ti0 - Brendo", // TJS - 37
            "Presidentes de Honra: Tchipe, Chock e Knight\n" +
            "Presidente: Pert\n" +
            "Vice presidente: Medo\n" +
            "Diretores Gerais: HugoTOIC e G4SP4R.TOIC\n" +
            "Responsável por apostar materiais: Presidente de honra, Presidente e Vice presidente.", // TOIC - 38
            "DIRETORIA NÃO INFORMADA NO FORUM", // FJY - 39
            "Presidente de Honra: [TGI]Leao\n" +
            "Presidente: [TGI]Coringa\n" +
            "Vice Presidente: [TGI]C0NE\n" +
            "Diretor Geral: [TGI]Tablet e [TGI]Picapau\n" +
            "Confrontos e x5\n" +
            "Quem tem a permissão de marcar CF: Leao, Coringa e C0NE\n" +
            "Quem tem a permissão de marcar x5: Leao, Coringa, C0NE e Slug", // TGI - 40
            "Presidentes De Honra: Soniik , Elloco & Manin\n" +
            "Presidente: Bro\n" +
            "Vice Presidente: Minho\n" +
            "Diretores: (EM BREVE)\n" +
            "Responsáveis por marcar x5 e CF: Presidentes de honra, Presidente e Vice presidente.", // TORC - 41
            "Presidente: Aty\n" +
            "Vice Presidente: Zeid\n" +
            "Diretores Gerais: Lahm, Thi e Diniz\n" +
            "Responsáveis por marcar x5 e CF: Aty e Zeid", // TOCA - 42
            "Presidente: TOB]PITGATE1BTL[PRES\n" +
            "Vice Presidente: [TOB]Weell.vPres[ORG e [TOB]DinhO.VG[ADM]\n" +
            "Diretor Geral: [TOB]_CRG.LBTR[PUX] e TOB]Ninho.DRTG[L.LDF\n" +
            "Responsáveis por x5 e CF: TOB]PITGATE1BTL[PRES / [TOB]Weell.vPres[ORG / [TOB]DinhO.VG[ADM]", // TOB - 43
            "Presidentes: Leo & Sheldon\n" +
            "Vice Presidente: Vodka\n" +
            "Diretores: Reinan & iSuurL\n" +
            "Organizadores: Sheldon , iSuurL & Mecinh0\n" +
            "Puxadores: Todin , Spark & Guiina\n" +
            "Responsáveis por CF/X5: Leo , Sheldon & Vodka", // TUI - 44
            "Presidente: Rick & Jonatan Sousa (GLX)\n" +
            "Vice Presidente: Magao\n" +
            "Presidentes de Honra : Cyclone (Bruno Ramos) &  Thuca (Lucas Sousa) \n" +
            "Diretor Geral : Febem e Fox\n" +
            "SOMENTE OS PRESH/PRES/VPRES podem apostar CF.\n" +
            "ORG e PUX podem apostar somente X5", // JGT - 45
            "Presidente : Pedrin (Pedro Robert).\n" +
            "Vice - Presidente: LFrota (LucasFrota)\n" +
            "Diretor Geral: Z.O(Luan)\n" +
            "Responsáveis por marcar x5 e CF: Z.O - LFrota - Pedrin", // TUF - 46
            "Presidente: Gui\n" +
            "Vice-Presidente: Malvado\n" +
            "Diretoria geral: Matt, Ailsin e Alecob\n" +
            "Responsaveis por marcar x5/CF: Malvado, Gui e Abn", // TOC - 47
            "Presidente: Gaiato\n" +
            "Vice Presidente: Papa\n" +
            "Diretor Geral: Gah\n" +
            "Responsáveis por marcar x5 e CF: Gaiato, Papa ,Gah", // MOFI - 48
            "Presidente: Zumba & Junin\n" +
            "Vice Presidente: Peixe e Marcio\n" +
            "Diretor Geral:\n" +
            "Diretor: Fuck\n" +
            "Diretor: Theus\n" +
            "Organizadores: Marcio & Junin\n" +
            "Puxadores: [TMV]MF | [TMV]Kabuloso \n" +
            "Responsáveis por marcar cf/x5: Peixe , Zumba, marcio e Fuck", // TMV - 49
            "Presidente: Beck\n" +
            "Vice-Presidente: Mayck\n" +
            "Diretor Geral: Gus\n" +
            "Responsável pela mudança da sede: Beck\n" +
            "Responsável por apostar x5/CF: Beck & Mayck", // TGA - 50
            "Diretoria Fúria Jovem do Baraúnas ★\n" +
            "Presidentes: OcP\n" +
            "Vice Presidente: Andre\n" +
            "Diretores: DaN\n" +
            "Organizadores: Andre\n" +
            "Puxadores: OcP, Firefox\n" +
            "Responsáveis por CF/X5: OcP, Andre", // FJBa - 51
            "Presidentes de Honra: Francisco Neto , Felipe Queiroz e Luis Otávio\n" +
            "Presidente: Ygor Cardoso\n" +
            "Vice Presidente: Phelype Martins ( PHL )\n" +
            "Diretor Geral: Menor.3BTL\n" +
            "Organizadores: Ygor e arley \n" +
            "Puxadores: Ramon, João & Dinho", // TUTB - 52
            "Presidente: [TTA]Isaac.2BTL[GM]\n" +
            "Vice Presidente: [TTA]CTM.VPRES[PUX]\n" +
            "Diretor Geral: [TTA]STK.DRT[ORG]\n" +
            "Responsáveis por marcar x5 e CF: Isaac, STK , CTM", // TTA - 53
            "Presidente: HUG0\n" +
            "Vice Presidente: BRUN0\n" +
            "Diretor Geral: MagO\n" +
            "Responsáveis por marcar x5 e CF: BRUN0 & HUG0", // TOMA - 54
            "Presidente: Ninho (Ausente)\n" +
            "Vice-Presidentes: Liu & Abon (Atuais responsáveis pela torcida)\n" +
            "Diretores gerais: Marllon e Jnr\n" +
            "Apostas de Materiais apenas com autorização dos Vice Presidentes (Liu/Abon)", // TOCA - 55
            "DIRETORIA NÃO INFORMADA NO FORUM", // TOMN - 56
            "Presidente : [TJG]BrenoBDS[ADM] e [TJG].G4L0_PRES[ORG] \n" +
            "Presidente de honra : [TJG]Chil.01[LDA]\n" +
            "Diretores : [TJG]Plek.DRGT[ORG] , [TJG]ZeuS.3BTL[ADM] , [TJG]Guga.01[RGT]\n" +
            "Organizadores : [TJG].G4L0_PRES[ORG] , [TJG]Plek.DRGT[ORG] e [TJG]Krizes.BDS[ORG]\n" +
            "Puxadores : [TJG]Antonio.01[LDA] , [TJG]Z3LL0.01[PUX] , [TJG]Mats.LBT13[PUX\n" +
            "Responsável por X5/CF : [TJG]Breno.BDS[ADM] e [TJG]ZeuS.3BTL[ADM]", // TJGa - 57
            "Presidente: Samuel\n" +
            "Vice Presidente: PRD (Pirado)\n" +
            "Diretor Geral: Anders.\n" +
            "Responsáveis por marcar x5 e CF: Samuel, PRD, Anders", // TJBpb - 58
            "Presidente:   Cheffe e LucasG\n" +
            "Vice-presidente:  Luck\n" +
            "Diretor Geral:  Alan\n" +
            "Responsável POR Marca X5 / CF: Pastor - Se apostar X5 ou CF sem eu estar presente não vai valer.", // TJF - 59
            "Presidente : Vilão\n" +
            "Vice presidente : Sem ninguém na função .\n" +
            "Presidente de Honra : Cavanha ( Cvn )\n" +
            "Diretor geral : Delirio\n" +
            "Quem pode apostar material : Vilão / Cvn" // TUV - 60
    };
    String[] TorcidasSkins = {
            "1, 107", // TJF - 1
            "98, 122", // RRN - 2
            "28, 102", // FJV - 3
            "33, 269", // FJB - 4
            "47, 280", // TJB - 5
            "106, 248", // TYF - 6
            "73", // TFF - 7
            "21, 80", // IJV - 8
            "180", // UBZ - 9
            "184, 250", // TTI - 10
            "2, 126", // MV - 11
            "271, 105", // GDF - 12
            "156, 206", // TJS - 13
            "12, 19", // C12 - 14
            "179", // DDR - 15
            "188", // P9 - 16
            "22, 240", // CMA - 17
            "27, 116", // TOG - 18
            "115", // TPI - 19
            "128", // HSG - 20
            "32, 259", // TOF - 21
            "104, 168", // IAV - 22
            "62", // TFI - 23
            "288, 293", // CMS12 - 24
            "20, 228", // PPL - 25
            "127, 268", // GDG - 26
            "15, 227", // MVJ - 27
            "202", // TOGA - 28
            "68", // UT - 29
            "109, 297", // FJG - 30
            "175, 270", // TEV - 31
            "146", // TDA - 32
            "5, 43", // IJG - 33
            "161", // TFB - 34
            "173", // TOR - 35
            "176, 203", // TJFan - 36
            "166", // TJS - 37
            "125, 279", // TOIC - 38
            "70", // FJY - 39
            "165", // TGI - 40
            "242", // TORC - 41
            "23, 18", // TOCA - 42
            "118, 292", // TOB - 43
            "30, 247", // TUI - 44
            "186", // JGT - 45
            "67, 66", // TUF - 46
            "49, 82", // TOC - 47
            "17", // MOFI - 48
            "267", // TMV - 49
            "48", // TGA - 50
            "103", // FJBa - 51
            "142", // TUTB - 52
            "34", // TTA - 53
            "163", // TOMA - 54
            "111", // TOCA - 55
            "278", // TOMN - 56
            "3, 299", // TJGa - 57
            "258", // TJBpb - 58
            "10, 14", // TFJ - 59
            "162" // TUV - 60
    };
    String[] TorcidasSuporte = {
            "", // TJF - 1
            "", // RRN - 2
            "", // FJV - 3
            "", // FJB - 4
            "", // TJB - 5
            "", // TYF - 6
            "", // TFF - 7
            "", // IJV - 8
            "", // UBZ - 9
            "", // TTI - 10
            "", // MV - 11
            "https://www.facebook.com/groups/217972231684876/", // GDF - 12
            "", // TJS - 13
            "", // C12 - 14
            "", // DDR - 15
            "", // P9 - 16
            "", // CMA - 17
            "", // TOG - 18
            "", // TPI - 19
            "", // HSG - 20
            "", // TOF - 21
            "", // IAV - 22
            "", // TFI - 23
            "", // CMS12 - 24
            "", // PPL - 25
            "", // GDG - 26
            "", // MVJ - 27
            "", // TOGA - 28
            "", // UT - 29
            "", // FJG - 30
            "", // TEV - 31
            "", // TDA - 32
            "", // IJG - 33
            "", // TFB - 34
            "", // TORu - 35
            "", // FAN - 36
            "", // TJS - 37
            "https://www.facebook.com/groups/toicgtnovatos/", // TOIC - 38
            "", // FJY - 39
            "", // TGI - 40
            "", // TORC - 41
            "", // TOCA - 42
            "", // TOB - 43
            "", // TUI - 44
            "https://www.facebook.com/groups/542366402488153/?fref=ts", // JGT - 45
            "https://www.facebook.com/leoesdatuf.gta.3?fref=ts", // TUF - 46
            "", // TOC - 47
            "", // MOFI - 48
            "", // TMV - 49
            "", // TGA - 50
            "", // FJBa - 51
            "", // TUTB - 52
            "", // TTA - 53
            "", // TOMA - 54
            "", // TOCA - 55
            "", // TOMN - 56
            "", // TJGa - 57
            "", // TJBpb - 58
            "", // TJF - 59
            "" // TUV - 60
    };

    String[] TorcidasGrito = {
            "", // TJF - 1
            "", // RRN - 2
            "", // FJV - 3
            "", // FJB - 4
            "", // TJB - 5
            "", // TYF - 6
            "", // TFF - 7
            "", // IJV - 8
            "", // UBZ - 9
            "", // TTI - 10
            "", // MV - 11
            "zsSHqbMN7Y4", // GDF - 12
            "", // TJS - 13
            "", // C12 - 14
            "", // DDR - 15
            "", // P9 - 16
            "", // CMA - 17
            "", // TOG - 18
            "", // TPI - 19
            "", // HSG - 20
            "", // TOF - 21
            "", // IAV - 22
            "", // TFI - 23
            "", // CMS12 - 24
            "", // PPL - 25
            "", // GDG - 26
            "", // MVJ - 27
            "", // TOGA - 28
            "", // UT - 29
            "", // FJG - 30
            "", // TEV - 31
            "", // TDA - 32
            "", // IJG - 33
            "", // TFB - 34
            "", // TORu - 35
            "", // FAN - 36
            "", // TJS - 37
            "TSagNwjSbSQ", // TOIC - 38
            "", // FJY - 39
            "", // TGI - 40
            "", // TORC - 41
            "", // TOCA - 42
            "", // TOB - 43
            "", // TUI - 44
            "", // JGT - 45
            "", // TUF - 46
            "", // TOC - 47
            "", // MOFI - 48
            "", // TMV - 49
            "", // TGA - 50
            "", // FJBa - 51
            "", // TUTB - 52
            "", // TTA - 53
            "", // TOMA - 54
            "", // TOCA - 55
            "", // TOMN - 56
            "", // TJGa - 57
            "", // TJBpb - 58
            "", // TJF - 59
            "" // TUV - 60
    };

    String[] TorcidasVideo = {
            "", // TJF - 1
            "", // RRN - 2
            "", // FJV - 3
            "", // FJB - 4
            "", // TJB - 5
            "", // TYF - 6
            "", // TFF - 7
            "", // IJV - 8
            "", // UBZ - 9
            "", // TTI - 10
            "", // MV - 11
            "6rsk7H6V0E8", // GDF - 12
            "", // TJS - 13
            "", // C12 - 14
            "", // DDR - 15
            "", // P9 - 16
            "", // CMA - 17
            "", // TOG - 18
            "", // TPI - 19
            "", // HSG - 20
            "", // TOF - 21
            "", // IAV - 22
            "", // TFI - 23
            "", // CMS12 - 24
            "", // PPL - 25
            "", // GDG - 26
            "", // MVJ - 27
            "", // TOGA - 28
            "", // UT - 29
            "", // FJG - 30
            "", // TEV - 31
            "", // TDA - 32
            "", // IJG - 33
            "", // TFB - 34
            "", // TORu - 35
            "", // FAN - 36
            "", // TJS - 37
            "", // TOIC - 38
            "", // FJY - 39
            "", // TGI - 40
            "", // TORC - 41
            "", // TOCA - 42
            "", // TOB - 43
            "", // TUI - 44
            "kMfojvPwWIU", // JGT - 45
            "KSgQRLQS3iI", // TUF - 46
            "", // TOC - 47
            "", // MOFI - 48
            "", // TMV - 49
            "", // TGA - 50
            "", // FJBa - 51
            "", // TUTB - 52
            "", // TTA - 53
            "", // TOMA - 54
            "", // TOCA - 55
            "", // TOMN - 56
            "", // TJGa - 57
            "", // TJBpb - 58
            "", // TJF - 59
            "" // TUV - 60
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.torcidasdetalhes_main);

        Bundle b = getIntent().getExtras();
        final int TorcidaId = b.getInt("TorcidaId");

        ImageView imgViewTorcida = (ImageView) findViewById(R.id.imageTorcidaView);
        imgViewTorcida.setImageResource(TorcidasLogos[TorcidaId]);

        String TorcidaSigla = TorcidasSiglas[TorcidaId];
        String TorcidaNome = TorcidasNomes[TorcidaId];
        String TorcidaDir = TorcidasDir[TorcidaId];
        String TorcidaSkins = "Skins: " + TorcidasSkins[TorcidaId];
        TextView TorcidaSuporteTitle = (TextView) findViewById(R.id.textTorcidaViewSuporteTitle);
        String TorcidaSuporte = TorcidasSuporte[TorcidaId];
        TextView TorcidaGritoTitle = (TextView) findViewById(R.id.textTorcidaGrito);
        ImageView videoViewTorcidaGrito = (ImageView) findViewById(R.id.videoTorcidaGrito);
        TextView TorcidaVideoTitle = (TextView) findViewById(R.id.textTorcidaVideo);
        ImageView videoViewTorcidaVideo = (ImageView) findViewById(R.id.videoTorcidaVideo);

        getSupportActionBar().setTitle(TorcidaSigla);

        TextView textViewSigla = (TextView) findViewById(R.id.textTorcidaViewSigla);
        textViewSigla.setText(TorcidaSigla);

        TextView textViewNome = (TextView) findViewById(R.id.textTorcidaViewNome);
        textViewNome.setText(TorcidaNome);

        TextView textViewDir = (TextView) findViewById(R.id.textTorcidaViewDir);
        textViewDir.setText(TorcidaDir);

        TextView textViewSkins = (TextView) findViewById(R.id.textTorcidaViewSkins);
        textViewSkins.setText(TorcidaSkins);

        TextView textViewSuporte = (TextView) findViewById(R.id.textTorcidaViewSuporte);
        if(TorcidaSuporte.length() > 0){
            textViewSuporte.setText(Html.fromHtml("<a href=\"" + TorcidaSuporte + "\">" + TorcidaSuporte + "</a>"));
            textViewSuporte.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else {
            TorcidaSuporteTitle.setVisibility(View.GONE);
            textViewSuporte.setVisibility(View.GONE);
        }

        if(TorcidasGrito[TorcidaId].length() > 0){
            videoViewTorcidaGrito.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + TorcidasGrito[TorcidaId])));
                }
            });
        }
        else {
            TorcidaGritoTitle.setVisibility(View.GONE);
            videoViewTorcidaGrito.setVisibility(View.GONE);
        }

        if(TorcidasVideo[TorcidaId].length() > 0){
            videoViewTorcidaVideo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + TorcidasVideo[TorcidaId])));
                }
            });
        }
        else {
            TorcidaVideoTitle.setVisibility(View.GONE);
            videoViewTorcidaVideo.setVisibility(View.GONE);
        }

        // Consultar o AdView como um recurso e carregar uma solicitação.
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
}
