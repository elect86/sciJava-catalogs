/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package sciJava

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import sciJava.catalogs.*

/**
 * A simple 'hello world' plugin.
 */
class SciJavaCatalogsPlugin : Plugin<Settings> {

    override fun apply(settings: Settings) {

        settings.enableFeaturePreview("VERSION_CATALOGS")
        // Register a task
        //        project.tasks.register("greeting") { task ->
        //            task.doLast {
        //                println("Hello from plugin 'sciJava.catalogs.greeting'")
        //            }
        //        }

        settings.dependencyResolutionManagement.versionCatalogs.apply {

            // SciJava - https://github.com/scijava
            addSciJava()

            // ImageJ - https://github.com/imagej
            addImagej()

            // ImgLib2 - https://github.com/imglib
            addImgLib2()

            // SCIFIO - https://github.com/scifio
            addScifio()

            // Standard Fiji projects
            addFiji()

            val misc = create("misc").apply {

                // External Fiji projects

                // SNT - https://github.com/morphonets/SNT
                alias("snt").to("org.morphonets:SNT:3.1.112")

                // JITK TPS - https://github.com/saalfeldlab/jitk-tps
                alias("jitkTps").to("jitk:jitk-tps:3.0.1")

                // BigWarp - https://github.com/saalfeldlab/bigwarp
                alias("bigwarpFiji").to("sc.fiji:bigwarp_fiji:6.0.0")

                // MPI-CBG - https://github.com/axtimwalde/mpicbg
                alias("mpicbg").to("mpicbg:mpicbg:1.4.1")

                // TrakEM2 TPS - https://github.com/saalfeldlab/trakem2-tps
                alias("trakem2Tps").to("sc.fiji:trakem2_tps:1.1.4")

                // Z-Spacing correction - https://github.com/saalfeldlab/z-spacing
                alias("zSpacing").to("sc.fiji:z_spacing:1.1.1")
            }

            val miscBundle = arrayListOf("snt", "jitkTps", "bigwarpFiji", "mpicbg", "trakem2Tps", "zSpacing")

            bigDataViewer()

            trakEM2()

            n5()

            boneJ()

            ome()

            omero()

            misc.apply {

                // Other SciJava components

                // MorphoLibJ - https://github.com/ijpb/MorphoLibJ
                alias("morphoLibJ").to("fr.inra.ijpb:MorphoLibJ_:1.4.2.1")

                // BigStitcher - https://github.com/PreibischLab/BigStitcher
                alias("bigStitcher").to("net.preibisch:BigStitcher:0.5.8")

                // multiview-reconstruction - https://github.com/PreibischLab/multiview-reconstruction
                alias("multiviewReconstruction").to("net.preibisch:multiview-reconstruction:0.7.2")

                // multiview-simulation - https://github.com/PreibischLab/multiview-simulation
                alias("multiviewSimulation").to("net.preibisch:multiview-simulation:0.2.0")

                // CoreMem - https://github.com/ClearControl/CoreMem
                alias("coreMem").to("net.clearcontrol:coremem:0.4.8")

                // ClearGL - https://github.com/ClearVolume/ClearGL
                alias("cleargl").to("net.clearvolume:cleargl:2.2.10")

                // Scenery - https://github.com/scenerygraphics/scenery
                alias("scenery").to("graphics.scenery:scenery:0.7.0-beta-7")

                // SciView - https://github.com/scenerygraphics/SciView
                alias("sciview").to("sc.iview:sciview:0.2.0-beta-5")

                // Third party components

                // Amazon S3 - https://aws.amazon.com/sdkforjava
                alias("awsJdkS3").to("com.amazonaws:aws-java-sdk-s3:1.11.796")


                miscBundle += listOf("morphoLibJ", "bigStitcher", "multiviewReconstruction", "multiviewSimulation",
                                     "coreMem", "cleargl", "scenery", "sciview", "awsJdkS3")
            }

            groovy()

            apache()

            batik()

            misc.apply {

                // Blosc - https://blosc.org/
                alias("jblosc").to("org.lasersonlab:jblosc:1.0.1")

                // CDI - http://cdi-spec.org/
                alias("cdi").to("javax.enterprise:cdi-api:1.2")


                miscBundle += listOf("jblosc", "cdi")
            }

            commons()

            misc.apply {

                // Byte Code Generation Library - https://github.com/cglib/cglib
                alias("cglib").to("cglib:cglib:3.3.0")


                miscBundle += "cglib"
            }

            eclipseCollection()

            eclipseSwt()

            googleCloud()

            misc.apply {

                // Gson - https://code.google.com/p/google-gson/
                alias("gson").to("com.google.code.gson:gson:2.8.6")

                // Guava - https://github.com/google/guava
                alias("guave").to("com.google.guava:guava:21.0")

                // HyperSQL DataBase - http://hsqldb.org/
                alias("hsqldb").to("hsqldb:hsqldb:1.8.0.10")

                // iText PDF - https://github.com/itext/itextpdf
                alias("itextpdf").to("com.itextpdf:itextpdf:5.5.13.1")

                // Jackrabbit WebDAV - https://jackrabbit.apache.org/jcr/components/jackrabbit-webdav-library.html
                alias("jackrabbitWebdav").to("org.apache.jackrabbit:jackrabbit-webdav:2.21.1")
                //            <exclusions>
                //            <exclusion>
                //            <!--
                //        Conflicts with commons-logging:commons-logging.
                //            If you depend on jackrabbit-webdav, add either
                //            commons-logging or jcl-over-slfj to your deps.
                //            See: http://www.slf4j.org/legacy.html#jcl-over-slf4j
                //            -->
                //            <groupId>org.slf4j</groupId>
                //            <artifactId>jcl-over-slf4j</artifactId>
                //            </exclusion>
                //            </exclusions>


                miscBundle += listOf("gson", "guave", "hsqldb", "itextpdf", "jackrabbitWebdav")
            }

            jackson()

            misc.apply {
                // Java Advanced Imaging - https://java.net/projects/jai-core
                val jai = "1.1.3"
                alias("jaiCodec").to("com.sun.media:jai-codec:$jai")
                alias("jaiCore").to("javax.media:jai-core:$jai")

                // JAMA - http://math.nist.gov/javanumerics/jama/
                alias("jama").to("gov.nist.math:jama:1.0.3")

                // Java 3D - https://github.com/scijava/java3d-core
                val java3d = "1.6.0-scijava-2"
                alias("j3dCore").to("org.scijava:j3dcore:$java3d")
                alias("j3dUtils").to("org.scijava:j3dutils:$java3d")
                alias("j3dVecmath").to("org.scijava:vecmath:$java3d")

                // Javassist - http://www.javassist.org/
                alias("javassist").to("org.javassist:javassist:3.27.0-GA")

                // JDOM - http://www.jdom.org/
                alias("jdom2").to("org.jdom:jdom2:2.0.6")

                // Java Expression Parser - https://github.com/scijava/jep
                alias("jep").to("org.scijava:jep:2.4.2")


                miscBundle += listOf("jaiCodec", "jaiCore", "jama", "j3dCore", "j3dUtils", "j3dVecmath", "javassist",
                                     "jdom2", "jep")
            }

            jetty()

            misc.apply {

                // JFreeChart - http://www.jfree.org/jfreechart/
                alias("jFreeChart").to("org.jfree:jfreechart:1.5.0")
                //            <exclusions>
                //            <exclusion>
                //            <groupId>xml-apis</groupId>
                //            <artifactId>xml-apis</artifactId>
                //            </exclusion>
                //            </exclusions>
                //            </dependency>

                // JFreeSVG - http://www.jfree.org/jfreesvg/
                alias("jFreeSvg").to("org.jfree:jfreesvg:3.4")

                miscBundle += listOf("jFreeChart", "jFreeSvg")
            }

            jGraphT()

            misc.apply {

                // JGraphX - https://github.com/jgraph/jgraphx
                alias("jGraphX").to("com.github.vlsi.mxgraph:jgraphx:4.1.0")

                // JHDF5 - https://wiki-bsse.ethz.ch/label/JHDF5/hdf5
                alias("jhdf5").to("cisd:jhdf5:14.12.6")


                miscBundle += listOf("jGraphX", "jhdf5")
            }

            jna()

            // Joda-Time - http://www.joda.org/joda-time/
            misc.alias("jodaTime").to("joda-time:joda-time:2.10.6")
            miscBundle += "jodaTime"

            jogamp()

            misc.apply {

                // JOML - http://joml-ci.github.io/JOML/
                alias("joml").to("org.joml:joml:1.9.25")

                // JPedal - http://jpedal.org/ (defunct)
                alias("jPedal").to("org.jpedal:jpedalSTD:2.80b11")

                // JSch - http://www.jcraft.com/jsch/
                alias("jSch").to("com.jcraft:jsch:0.1.55")

                // Jython - https://jython.org/
                alias("jython").to("org.python:jython-slim:2.7.2")

                // JZlib - http://www.jcraft.com/jzlib/
                alias("jZlib").to("com.jcraft:jzlib:1.1.3")


                miscBundle += listOf("joml", "jPedal", "jSch", "jython", "jZlib")
            }

            kotlin()

            logBack()

            misc.apply {

                // LZ4 compression for Java - https://github.com/lz4/lz4-java
                alias("lz4").to("org.lz4:lz4-java:1.7.1")

                // MapDB - http://www.mapdb.org/
                alias("mapDB").to("org.mapdb:mapdb:3.0.8")
                //            <exclusions>
                //            <exclusion>
                //            <!--
                //        Conflicts with org.lz4:lz4-java.
                //            You may need to add it to your deps.
                //            -->
                //            <groupId>net.jpountz.lz4</groupId>
                //            <artifactId>lz4</artifactId>
                //            </exclusion>
                //            </exclusions>
                //            </dependency>

                miscBundle += listOf("lz4", "mapDB")
            }

            migLayout()

            misc.apply {

                // Mines JTK - https://github.com/dhale/jtk
                alias("minesJTK").to("edu.mines:mines-jtk:20151125")

                // oj! Algorithms - https://github.com/optimatika/ojAlgo
                alias("ojAlgo").to("org.ojalgo:ojalgo:45.1.1")

                // OpenCSV - http://opencsv.sourceforge.net/
                alias("openCSV").to("com.opencsv:opencsv:5.2")

                // picocli - http://picocli.info/
                alias("picocli").to("info.picocli:picocli:4.3.2")

                // PostgreSQL JDBC Driver - https://jdbc.postgresql.org/
                alias("postgreSQL").to("org.postgresql:postgresql:42.2.12")


                miscBundle += listOf("minesJTK", "ojAlgo", "openCSV", "picocli", "postgreSQL")
            }

            rSyntaxTextArea()

            slf4j()

            snakeYAML()

            // Spring - https://spring.io/
            misc.alias("spring").to("org.springframework:spring-aop:3.2.9.RELEASE")
            //               NB: 3.2.9.RELEASE is the last version not to depend properly on
            //               aopalliance:aopalliance, rather than including org.aopalliance
            //               classes unshadowed!
            miscBundle += "spring"

            tensorFlow()

            misc.apply {

                // Trove - http://trove.starlight-systems.com/
                alias("trove").to("net.sf.trove4j:trove4j:3.0.3")

                // Weka - http://www.cs.waikato.ac.nz/ml/weka/
                alias("wekaDev").to("nz.ac.waikato.cms.weka:weka-dev:3.9.4")
                //            <exclusions>
                //            <exclusion>
                //            <groupId>com.github.fommil.netlib</groupId>
                //            <artifactId>all</artifactId>
                //            </exclusion>
                //            <exclusion>
                //            <!-- Conflicts with com.github.vbmacher:java-cup -->
                //            <groupId>com.github.vbmacher</groupId>
                //            <artifactId>java-cup-runtime</artifactId>
                //            </exclusion>
                //            <exclusion>
                //            <groupId>com.googlecode.netlib-java</groupId>
                //            <artifactId>netlib-java</artifactId>
                //            </exclusion>
                //            <exclusion>
                //            <groupId>nz.ac.waikato.cms.weka.thirdparty</groupId>
                //            <artifactId>java-cup-11b</artifactId>
                //            </exclusion>
                //            <exclusion>
                //            <groupId>nz.ac.waikato.cms.weka.thirdparty</groupId>
                //            <artifactId>java-cup-11b-runtime</artifactId>
                //            </exclusion>
                //            <exclusion>
                //            <groupId>net.sourceforge.f2j</groupId>
                //            <artifactId>arpack_combined_all</artifactId>
                //            </exclusion>
                //            </exclusions>
                //            </dependency>

                // XZ for Java - https://tukaani.org/xz/java.html
                alias("xz").to("org.tukaani:xz:1.8")


                //            <!-- Test scope dependencies -->

                // JUnit 4 - https://junit.org/junit4/
                alias("junit4").to("junit:junit:4.13")


                miscBundle += listOf("trove", "wekaDev", "xz", "junit4")
            }

            junit5()

            misc.apply {

                // JMockit - https://jmockit.github.io/
                alias("jMockit").to("org.jmockit:jmockit:1.49")

                // Mockito - http://site.mockito.org/
                alias("mockito").to("org.mockito:mockito-core:2.19.0")


                bundle("all", miscBundle + "jMockit" + "mockito")
            }

            jmh()
        }
    }
}